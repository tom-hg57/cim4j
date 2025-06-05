package cim4jdb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    private TopologicalIsland.Repository topologicalIslandRepository;
    private HashSet<Long> savedTopologicalIslandIds = new HashSet<>();
    @Autowired
    private TopologicalNode.Repository topologicalNodeRepository;
    private HashSet<Long> savedTopologicalNodeIds = new HashSet<>();

    @AfterEach
    public void cleanUpDatabase() {
        baseVoltageRepository.deleteAllById(savedBaseVoltageIds);
        topologicalIslandRepository.deleteAllById(savedTopologicalIslandIds);
        topologicalNodeRepository.deleteAllById(savedTopologicalNodeIds);
        cimModelRepository.deleteAllById(savedModelIds);
        savedBaseVoltageIds.clear();
        savedTopologicalIslandIds.clear();
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

        var objMap = cimModelService.getCimObjectInfos(model.getCimModelId());
        assertNotNull(objMap);
        assertEquals(2, objMap.size());

        assertTrue(objMap.containsKey("BaseVoltage"));
        assertTrue(objMap.containsKey("TopologicalNode"));
        assertEquals(1, objMap.get("BaseVoltage").size());
        assertEquals(1, objMap.get("TopologicalNode").size());

        assertTrue(objMap.get("BaseVoltage").contains(baseVoltage.getId()));
        assertTrue(objMap.get("TopologicalNode").contains(topologicalNode.getId()));
    }

    @Test
    @Order(120)
    public void saveCimModel() {
        var baseVoltage = CimClassMap.createCimObject("BaseVoltage", "rdfid1");
        var topologicalNode = CimClassMap.createCimObject("TopologicalNode", "rdfid2");

        var model = cimModelService.saveCimModel(new CimModel(), List.of(baseVoltage, topologicalNode));
        assertNotNull(model);
        assertNotNull(model.getCimModelId());
        savedModelIds.add(model.getCimModelId());

        var objMap = cimModelService.getCimObjectInfos(model.getCimModelId());
        assertNotNull(objMap);
        assertEquals(2, objMap.size());

        assertTrue(objMap.containsKey("BaseVoltage"));
        assertTrue(objMap.containsKey("TopologicalNode"));
        assertEquals(1, objMap.get("BaseVoltage").size());
        assertEquals(1, objMap.get("TopologicalNode").size());

        var baseVoltageId = objMap.get("BaseVoltage").get(0);
        var topologicalNodeId = objMap.get("TopologicalNode").get(0);
        assertNotNull(baseVoltageId);
        assertNotNull(topologicalNodeId);
        savedBaseVoltageIds.add(baseVoltageId);
        savedTopologicalNodeIds.add(topologicalNodeId);
    }

    @Test
    @Order(130)
    public void saveCimObjects() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        var baseVoltage = CimClassMap.createCimObject("BaseVoltage", "rdfid1");
        var topologicalNode = CimClassMap.createCimObject("TopologicalNode", "rdfid2");
        assertNull(baseVoltage.getId());
        assertNull(topologicalNode.getId());

        var savedObjects = cimModelService.saveCimObjects(List.of(baseVoltage, topologicalNode), model);
        assertNotNull(savedObjects);

        baseVoltage = null;
        topologicalNode = null;
        int count = 0;
        for (var obj : savedObjects) {
            if (obj.getClass().equals(BaseVoltage.class)) {
                baseVoltage = obj;
            } else if (obj.getClass().equals(TopologicalNode.class)) {
                topologicalNode = obj;
            }
            ++count;
        }
        assertEquals(2, count);
        assertNotNull(baseVoltage);
        assertNotNull(topologicalNode);

        assertEquals(BaseVoltage.class, baseVoltage.getClass());
        assertEquals(TopologicalNode.class, topologicalNode.getClass());
        assertNotNull(baseVoltage.getId());
        assertNotNull(topologicalNode.getId());
        savedBaseVoltageIds.add(baseVoltage.getId());
        savedTopologicalNodeIds.add(topologicalNode.getId());

        assertNotNull(baseVoltage.getCimModel());
        assertNotNull(topologicalNode.getCimModel());
        assertEquals(model.getCimModelId(), baseVoltage.getCimModel().getCimModelId());
        assertEquals(model.getCimModelId(), topologicalNode.getCimModel().getCimModelId());
        assertEquals("rdfid1", baseVoltage.getRdfid());
        assertEquals("rdfid2", topologicalNode.getRdfid());

        var objMap = cimModelService.getCimObjectInfos(model.getCimModelId());
        assertNotNull(objMap);
        assertEquals(2, objMap.size());

        assertTrue(objMap.containsKey("BaseVoltage"));
        assertTrue(objMap.containsKey("TopologicalNode"));
        assertEquals(1, objMap.get("BaseVoltage").size());
        assertEquals(1, objMap.get("TopologicalNode").size());

        assertTrue(objMap.get("BaseVoltage").contains(baseVoltage.getId()));
        assertTrue(objMap.get("TopologicalNode").contains(topologicalNode.getId()));
    }

    @Test
    @Order(140)
    public void readCimObjects_without_linkCimObjects() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        var baseVoltage = CimClassMap.createCimObject(BaseVoltage.class, "rdfid1");
        var topologicalNode = CimClassMap.createCimObject(TopologicalNode.class, "rdfid2");
        topologicalNode.setAttribute("BaseVoltage", baseVoltage);
        assertEquals(baseVoltage, topologicalNode.getBaseVoltage());
        assertEquals(baseVoltage, topologicalNode.getAttribute("BaseVoltage"));

        var savedObjects = cimModelService.saveCimObjects(List.of(baseVoltage, topologicalNode), model);
        for (var obj : savedObjects) {
            if (obj.getClass().equals(BaseVoltage.class)) {
                savedBaseVoltageIds.add(obj.getId());
            } else if (obj.getClass().equals(TopologicalNode.class)) {
                savedTopologicalNodeIds.add(obj.getId());
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
        assertEquals(model.getCimModelId(), obj.getCimModel().getCimModelId());
        assertEquals(baseVoltage.getRdfid(), obj.getRdfid());
        assertEquals("BaseVoltage", obj.getCimType());
        assertTrue(obj instanceof BaseVoltage);
        baseVoltage = (BaseVoltage) obj;

        obj = objMap.get(topologicalNode.getRdfid());
        assertNotNull(obj);
        assertNotNull(obj.getId());
        assertNotNull(obj.getCimModel());
        assertEquals(model.getCimModelId(), obj.getCimModel().getCimModelId());
        assertEquals(topologicalNode.getRdfid(), obj.getRdfid());
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
    @Order(150)
    public void readCimObjects() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        var baseVoltage = CimClassMap.createCimObject(BaseVoltage.class, "rdfid1");
        var topologicalNode = CimClassMap.createCimObject(TopologicalNode.class, "rdfid2");
        topologicalNode.setAttribute("BaseVoltage", baseVoltage);
        assertEquals(baseVoltage, topologicalNode.getBaseVoltage());
        assertEquals(baseVoltage, topologicalNode.getAttribute("BaseVoltage"));

        var savedObjects = cimModelService.saveCimObjects(List.of(baseVoltage, topologicalNode), model);
        for (var obj : savedObjects) {
            if (obj.getClass().equals(BaseVoltage.class)) {
                savedBaseVoltageIds.add(obj.getId());
            } else if (obj.getClass().equals(TopologicalNode.class)) {
                savedTopologicalNodeIds.add(obj.getId());
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
        assertEquals(model.getCimModelId(), obj.getCimModel().getCimModelId());
        assertEquals(baseVoltage.getRdfid(), obj.getRdfid());
        assertEquals("BaseVoltage", obj.getCimType());
        assertTrue(obj instanceof BaseVoltage);
        baseVoltage = (BaseVoltage) obj;

        obj = objMap.get(topologicalNode.getRdfid());
        assertNotNull(obj);
        assertNotNull(obj.getId());
        assertNotNull(obj.getCimModel());
        assertEquals(model.getCimModelId(), obj.getCimModel().getCimModelId());
        assertEquals(topologicalNode.getRdfid(), obj.getRdfid());
        assertEquals("TopologicalNode", obj.getCimType());
        assertTrue(obj instanceof TopologicalNode);
        topologicalNode = (TopologicalNode) obj;

        assertEquals(baseVoltage, topologicalNode.getBaseVoltage());
        assertEquals(baseVoltage, topologicalNode.getAttribute("BaseVoltage"));

        var topologicalNodeSet = baseVoltage.getTopologicalNode();
        assertNotNull(topologicalNodeSet);
        assertEquals(1, topologicalNodeSet.size());
        assertTrue(topologicalNodeSet.contains(topologicalNode));
        assertEquals(topologicalNodeSet, baseVoltage.getAttribute("TopologicalNode"));
    }

    @Test
    @Order(160)
    public void readCimObjects_with_links_to_not_existing_objects() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        var topologicalIsland = CimClassMap.createCimObject(TopologicalIsland.class, "rdfid1");
        var topologicalNode = CimClassMap.createCimObject(TopologicalNode.class, "rdfid2");
        topologicalIsland.setAttribute("TopologicalNodes", topologicalNode); // existing link
        topologicalIsland.setAttribute("TopologicalNodes", "rdfid3"); // NOT existing link
        var topologicalNodes = topologicalIsland.getTopologicalNodes();
        assertNotNull(topologicalNodes);
        assertEquals(1, topologicalNodes.size());
        assertTrue(topologicalNodes.contains(topologicalNode)); // existing link
        var topologicalNodesIdSet = topologicalIsland.getAttribute("TopologicalNodes");
        assertTrue(topologicalNodesIdSet instanceof Set<?>);
        assertEquals(2, ((Set<?>) topologicalNodesIdSet).size());
        assertTrue(((Set<?>) topologicalNodesIdSet).contains("rdfid2")); // existing link
        assertTrue(((Set<?>) topologicalNodesIdSet).contains("rdfid3")); // NOT existing link

        var savedObjects = cimModelService.saveCimObjects(List.of(topologicalIsland, topologicalNode), model);
        for (var obj : savedObjects) {
            if (obj.getClass().equals(TopologicalIsland.class)) {
                savedTopologicalIslandIds.add(obj.getId());
            } else if (obj.getClass().equals(TopologicalNode.class)) {
                savedTopologicalNodeIds.add(obj.getId());
            }
        }

        var objMap = cimModelService.readCimObjects(model.getCimModelId());
        assertNotNull(objMap);
        assertEquals(2, objMap.size());

        assertTrue(objMap.containsKey(topologicalIsland.getRdfid()));
        assertTrue(objMap.containsKey(topologicalNode.getRdfid()));

        var obj = objMap.get(topologicalIsland.getRdfid());
        assertNotNull(obj);
        assertNotNull(obj.getId());
        assertNotNull(obj.getCimModel());
        assertEquals(model.getCimModelId(), obj.getCimModel().getCimModelId());
        assertEquals(topologicalIsland.getRdfid(), obj.getRdfid());
        assertEquals("TopologicalIsland", obj.getCimType());
        assertTrue(obj instanceof TopologicalIsland);
        topologicalIsland = (TopologicalIsland) obj;

        obj = objMap.get(topologicalNode.getRdfid());
        assertNotNull(obj);
        assertNotNull(obj.getId());
        assertNotNull(obj.getCimModel());
        assertEquals(model.getCimModelId(), obj.getCimModel().getCimModelId());
        assertEquals(topologicalNode.getRdfid(), obj.getRdfid());
        assertEquals("TopologicalNode", obj.getCimType());
        assertTrue(obj instanceof TopologicalNode);
        topologicalNode = (TopologicalNode) obj;

        assertEquals(topologicalIsland, topologicalNode.getTopologicalIsland());
        assertEquals(topologicalIsland, topologicalNode.getAttribute("TopologicalIsland"));

        topologicalNodes = topologicalIsland.getTopologicalNodes();
        assertNotNull(topologicalNodes);
        assertEquals(1, topologicalNodes.size());
        assertTrue(topologicalNodes.contains(topologicalNode)); // existing link
        topologicalNodesIdSet = topologicalIsland.getAttribute("TopologicalNodes");
        assertTrue(topologicalNodesIdSet instanceof Set<?>);
        assertEquals(2, ((Set<?>) topologicalNodesIdSet).size());
        assertTrue(((Set<?>) topologicalNodesIdSet).contains("rdfid2")); // existing link
        assertTrue(((Set<?>) topologicalNodesIdSet).contains("rdfid3")); // NOT existing link
    }

    @Test
    @Order(170)
    public void deleteCimModel() {
        var model = cimModelRepository.save(new CimModel());
        var baseVoltage = CimClassMap.createCimObject("BaseVoltage", "rdfid1");
        var topologicalNode = CimClassMap.createCimObject("TopologicalNode", "rdfid2");
        var savedObjects = cimModelService.saveCimObjects(List.of(baseVoltage, topologicalNode), model);
        baseVoltage = null;
        topologicalNode = null;
        for (var obj : savedObjects) {
            if (obj.getClass().equals(BaseVoltage.class)) {
                baseVoltage = obj;
            } else if (obj.getClass().equals(TopologicalNode.class)) {
                topologicalNode = obj;
            }
        }
        assertNotNull(baseVoltage);
        assertNotNull(topologicalNode);
        cimModelService.deleteCimModel(model.getCimModelId());

        assertFalse(cimModelRepository.existsById(model.getCimModelId()));
        assertFalse(baseVoltageRepository.existsById(baseVoltage.getId()));
        assertFalse(topologicalNodeRepository.existsById(topologicalNode.getId()));
    }
}
