package cim4jdb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cim4jdb.main.Application;

@SpringBootTest(classes = Application.class)
@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ModelTest {

    @Autowired
    private CimModelService cimModelService;
    @Autowired
    private CimModel.Repository cimModelRepository;
    private HashSet<Long> savedModelIds = new HashSet<>();

    @Autowired
    private BaseVoltage.Repository baseVoltageRepository;
    private HashSet<Long> savedBaseVoltageIds = new HashSet<>();
    @Autowired
    private TopologicalNode.Repository topologicalNodeRepository;
    private HashSet<Long> savedTopologicalNodeIds = new HashSet<>();

    @AfterEach
    public void cleanUpDatabase() {
        baseVoltageRepository.deleteAllById(savedBaseVoltageIds);
        topologicalNodeRepository.deleteAllById(savedTopologicalNodeIds);
        cimModelRepository.deleteAllById(savedModelIds);
        savedBaseVoltageIds.clear();
        savedTopologicalNodeIds.clear();
        savedModelIds.clear();
    }

    @Test
    @Order(100)
    public void createEntriesWithDifferentIds() {
        var model1 = cimModelRepository.save(new CimModel());
        var model2 = cimModelRepository.save(new CimModel());

        assertNotNull(model1.getCimModelId());
        savedModelIds.add(model1.getCimModelId());
        assertNotNull(model2.getCimModelId());
        savedModelIds.add(model2.getCimModelId());
        assertNotEquals(model1.getCimModelId(), model2.getCimModelId());
    }

    @Test
    @Order(110)
    public void getCimObjectInfos() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        var baseVoltage = CimClassMap.createCimObject(BaseVoltage.class, "rdfid1");
        baseVoltage.setCimModel(model);
        baseVoltage = baseVoltageRepository.save(baseVoltage);
        savedBaseVoltageIds.add(baseVoltage.getId());

        var topologicalNode = CimClassMap.createCimObject(TopologicalNode.class, "rdfid2");
        topologicalNode.setCimModel(model);
        topologicalNode = topologicalNodeRepository.save(topologicalNode);
        savedTopologicalNodeIds.add(topologicalNode.getId());

        Map<Long, String> objects = cimModelService.getCimObjectInfos(model.getCimModelId());
        assertNotNull(objects);
        assertEquals(2, objects.size());

        assertTrue(objects.containsKey(baseVoltage.getId()));
        assertTrue(objects.containsKey(topologicalNode.getId()));

        assertEquals("BaseVoltage", objects.get(baseVoltage.getId()));
        assertEquals("TopologicalNode", objects.get(topologicalNode.getId()));
    }

    @Test
    @Order(120)
    public void saveCimObject() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        var baseVoltage = cimModelService.saveCimObject(CimClassMap.createCimObject("BaseVoltage", "rdfid1"), model);
        assertNotNull(baseVoltage.getId());
        savedBaseVoltageIds.add(baseVoltage.getId());
        assertNotNull(baseVoltage.getCimModel());
        assertEquals(model.getCimModelId(), baseVoltage.getCimModel().getCimModelId());

        var topologicalNode = cimModelService.saveCimObject(CimClassMap.createCimObject("TopologicalNode", "rdfid2"),
                model);
        assertNotNull(topologicalNode.getId());
        savedTopologicalNodeIds.add(topologicalNode.getId());
        assertNotNull(topologicalNode.getCimModel());
        assertEquals(model.getCimModelId(), topologicalNode.getCimModel().getCimModelId());

        Map<Long, String> objects = cimModelService.getCimObjectInfos(model.getCimModelId());
        assertNotNull(objects);
        assertEquals(2, objects.size());

        assertTrue(objects.containsKey(baseVoltage.getId()));
        assertTrue(objects.containsKey(topologicalNode.getId()));
    }

    @Test
    @Order(130)
    public void saveCimObjects() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        List<BaseClass> objList = List.of(CimClassMap.createCimObject("BaseVoltage", "rdfid1"),
                CimClassMap.createCimObject("TopologicalNode", "rdfid2"));
        var savedObjects = cimModelService.saveCimObjects(objList, model);
        for (var savedObject : savedObjects) {
            if (savedObject.getCimType().equals("BaseVoltage")) {
                savedBaseVoltageIds.add(savedObject.getId());
            } else if (savedObject.getCimType().equals("TopologicalNode")) {
                savedTopologicalNodeIds.add(savedObject.getId());
            }
        }

        var obj1 = objList.get(0);
        assertNotNull(obj1.getId());
        assertNotNull(obj1.getCimModel());
        assertEquals(model.getCimModelId(), obj1.getCimModel().getCimModelId());

        var obj2 = objList.get(1);
        assertNotNull(obj2.getId());
        assertNotNull(obj2.getCimModel());
        assertEquals(model.getCimModelId(), obj2.getCimModel().getCimModelId());

        Map<Long, String> objects = cimModelService.getCimObjectInfos(model.getCimModelId());
        assertNotNull(objects);
        assertEquals(2, objects.size());

        assertTrue(objects.containsKey(obj1.getId()));
        assertTrue(objects.containsKey(obj2.getId()));
    }

    @Test
    @Order(140)
    public void readCimObjects_without_linkCimObjects() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        var baseVoltage = CimClassMap.createCimObject(BaseVoltage.class, "rdfid1");
        baseVoltage.setCimModel(model);

        var topologicalNode = CimClassMap.createCimObject(TopologicalNode.class, "rdfid2");
        topologicalNode.setCimModel(model);

        topologicalNode.setAttribute("BaseVoltage", baseVoltage);
        assertEquals(baseVoltage, topologicalNode.getBaseVoltage());
        assertEquals(baseVoltage, topologicalNode.getAttribute("BaseVoltage"));

        List<BaseClass> objList = List.of(baseVoltage, topologicalNode);
        var savedObjects = cimModelService.saveCimObjects(objList, model);
        for (var savedObject : savedObjects) {
            if (savedObject.getCimType().equals("BaseVoltage")) {
                savedBaseVoltageIds.add(savedObject.getId());
            } else if (savedObject.getCimType().equals("TopologicalNode")) {
                savedTopologicalNodeIds.add(savedObject.getId());
            }
        }

        var objMap = cimModelService.readCimObjects(model.getCimModelId(), false);
        assertNotNull(objMap);
        assertEquals(2, objMap.size());

        assertTrue(objMap.containsKey(baseVoltage.getRdfid()));
        assertTrue(objMap.containsKey(topologicalNode.getRdfid()));

        var obj = objMap.get(baseVoltage.getRdfid());
        assertNotNull(obj);
        assertNotNull(obj.getId());
        assertNotNull(obj.getCimModel());
        assertEquals(baseVoltage.getId(), obj.getId());
        assertEquals(model.getCimModelId(), obj.getCimModel().getCimModelId());
        assertEquals("BaseVoltage", obj.getCimType());
        assertTrue(obj instanceof BaseVoltage);
        baseVoltage = (BaseVoltage) obj;

        obj = objMap.get(topologicalNode.getRdfid());
        assertNotNull(obj);
        assertNotNull(obj.getId());
        assertNotNull(obj.getCimModel());
        assertEquals(topologicalNode.getId(), obj.getId());
        assertEquals(model.getCimModelId(), obj.getCimModel().getCimModelId());
        assertEquals("TopologicalNode", obj.getCimType());
        assertTrue(obj instanceof TopologicalNode);
        topologicalNode = (TopologicalNode) obj;

        assertNull(topologicalNode.getBaseVoltage()); // without linkCimObjects
        assertEquals(baseVoltage.getRdfid(), topologicalNode.getAttribute("BaseVoltage"));

        var topologicalNodeSet = baseVoltage.getTopologicalNode();
        assertNotNull(topologicalNodeSet);
        assertEquals(0, topologicalNodeSet.size()); // without linkCimObjects
    }

    @Test
    @Order(145)
    public void readCimObjects() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        var baseVoltage = CimClassMap.createCimObject(BaseVoltage.class, "rdfid1");
        baseVoltage.setCimModel(model);

        var topologicalNode = CimClassMap.createCimObject(TopologicalNode.class, "rdfid2");
        topologicalNode.setCimModel(model);

        topologicalNode.setAttribute("BaseVoltage", baseVoltage);
        assertEquals(baseVoltage, topologicalNode.getBaseVoltage());
        assertEquals(baseVoltage, topologicalNode.getAttribute("BaseVoltage"));

        List<BaseClass> objList = List.of(baseVoltage, topologicalNode);
        var savedObjects = cimModelService.saveCimObjects(objList, model);
        for (var savedObject : savedObjects) {
            if (savedObject.getCimType().equals("BaseVoltage")) {
                savedBaseVoltageIds.add(savedObject.getId());
            } else if (savedObject.getCimType().equals("TopologicalNode")) {
                savedTopologicalNodeIds.add(savedObject.getId());
            }
        }

        var objMap = cimModelService.readCimObjects(model.getCimModelId());
        assertNotNull(objMap);
        assertEquals(2, objMap.size());

        assertTrue(objMap.containsKey(baseVoltage.getRdfid()));
        assertTrue(objMap.containsKey(topologicalNode.getRdfid()));

        var obj = objMap.get(baseVoltage.getRdfid());
        assertNotNull(obj);
        assertNotNull(obj.getId());
        assertNotNull(obj.getCimModel());
        assertEquals(baseVoltage.getId(), obj.getId());
        assertEquals(model.getCimModelId(), obj.getCimModel().getCimModelId());
        assertEquals("BaseVoltage", obj.getCimType());
        assertTrue(obj instanceof BaseVoltage);
        baseVoltage = (BaseVoltage) obj;

        obj = objMap.get(topologicalNode.getRdfid());
        assertNotNull(obj);
        assertNotNull(obj.getId());
        assertNotNull(obj.getCimModel());
        assertEquals(topologicalNode.getId(), obj.getId());
        assertEquals(model.getCimModelId(), obj.getCimModel().getCimModelId());
        assertEquals("TopologicalNode", obj.getCimType());
        assertTrue(obj instanceof TopologicalNode);
        topologicalNode = (TopologicalNode) obj;

        assertEquals(baseVoltage, topologicalNode.getBaseVoltage());
        assertEquals(baseVoltage, topologicalNode.getAttribute("BaseVoltage"));

        var topologicalNodeSet = baseVoltage.getTopologicalNode();
        assertNotNull(topologicalNodeSet);
        assertEquals(1, topologicalNodeSet.size());
        assertTrue(topologicalNodeSet.contains(topologicalNode));
    }

    @Test
    @Order(150)
    public void deleteCimModel() {
        var model = cimModelRepository.save(new CimModel());

        var baseVoltage = CimClassMap.createCimObject(BaseVoltage.class, "rdfid1");
        baseVoltage.setCimModel(model);
        baseVoltage = cimModelService.saveCimObject(baseVoltage, model);

        var topologicalNode = CimClassMap.createCimObject(TopologicalNode.class, "rdfid2");
        topologicalNode.setCimModel(model);
        topologicalNode = cimModelService.saveCimObject(topologicalNode, model);

        cimModelService.deleteCimModel(model.getCimModelId());

        assertFalse(cimModelRepository.existsById(model.getCimModelId()));
        assertFalse(baseVoltageRepository.existsById(baseVoltage.getId()));
        assertFalse(topologicalNodeRepository.existsById(topologicalNode.getId()));
    }
}
