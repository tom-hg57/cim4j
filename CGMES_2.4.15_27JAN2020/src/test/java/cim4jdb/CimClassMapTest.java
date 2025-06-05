package cim4jdb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.List;

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
public class CimClassMapTest {

    @Autowired
    private CimClassMap cimClassMap;
    @Autowired
    private CimModel.Repository cimModelRepository;
    private HashSet<Long> savedModelIds = new HashSet<>();
    @Autowired
    private BaseVoltage.Repository baseVoltageRepository;
    private HashSet<Long> savedBaseVoltageIds = new HashSet<>();

    @AfterEach
    public void cleanUpDatabase() {
        baseVoltageRepository.deleteAllById(savedBaseVoltageIds);
        cimModelRepository.deleteAllById(savedModelIds);
        savedBaseVoltageIds.clear();
        savedModelIds.clear();
    }

    @Test
    @Order(100)
    public void isCimClass() {
        assertTrue(CimClassMap.isCimClass("BaseVoltage"));
        assertFalse(CimClassMap.isCimClass("dummy"));
    }

    @Test
    @Order(110)
    public void createCimObject() {
        BaseClass obj1 = CimClassMap.createCimObject("BaseVoltage", "rdfid1");
        BaseClass obj2 = CimClassMap.createCimObject("BaseVoltage", "rdfid2");
        assertNotNull(obj1);
        assertNotNull(obj2);
        assertEquals(BaseVoltage.class, obj1.getClass());
        assertEquals(BaseVoltage.class, obj2.getClass());
        assertNotSame(obj1, obj2);
    }

    @Test
    @Order(120)
    public void createCimObjectWithType() {
        BaseVoltage obj1 = CimClassMap.createCimObject(BaseVoltage.class, "rdfid1");
        BaseVoltage obj2 = CimClassMap.createCimObject(BaseVoltage.class, "rdfid2");
        assertNotNull(obj1);
        assertNotNull(obj2);
        assertNotSame(obj1, obj2);
    }

    @Test
    @Order(130)
    public void saveCimObjects() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        BaseClass obj = CimClassMap.createCimObject("BaseVoltage", "rdfid");
        assertNull(obj.getId());
        obj.setCimModel(model);
        var savedObjects = cimClassMap.saveCimObjects("BaseVoltage", List.of(obj));

        assertNotNull(savedObjects);
        BaseClass savedObj = savedObjects.iterator().next();
        assertNotNull(savedObj);
        assertEquals(BaseVoltage.class, savedObj.getClass());
        assertNotNull(savedObj.getId());
        savedBaseVoltageIds.add(savedObj.getId());
    }

    @Test
    @Order(140)
    public void saveCimObjectsWithType() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        BaseVoltage obj = CimClassMap.createCimObject(BaseVoltage.class, "rdfid");
        assertNull(obj.getId());
        obj.setCimModel(model);
        var savedObjects = cimClassMap.saveCimObjects(BaseVoltage.class, List.of(obj));

        assertNotNull(savedObjects);
        BaseVoltage savedObj = savedObjects.iterator().next();
        assertNotNull(savedObj);
        assertNotNull(savedObj.getId());
        savedBaseVoltageIds.add(savedObj.getId());
    }

    @Test
    @Order(150)
    public void readCimObjects() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        BaseClass obj = CimClassMap.createCimObject("BaseVoltage", "rdfid");
        obj.setCimModel(model);
        var savedObjects = cimClassMap.saveCimObjects("BaseVoltage", List.of(obj));
        BaseClass savedObj = savedObjects.iterator().next();
        savedBaseVoltageIds.add(savedObj.getId());
        var readObjects = cimClassMap.readCimObjects("BaseVoltage", List.of(savedObj.getId()));

        assertNotNull(readObjects);
        BaseClass readObj = readObjects.iterator().next();
        assertNotNull(readObj);
        assertEquals(savedObj.getId(), readObj.getId());
        assertEquals(BaseVoltage.class, readObj.getClass());
    }

    @Test
    @Order(160)
    public void readCimObjectsWithType() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        BaseVoltage obj = CimClassMap.createCimObject(BaseVoltage.class, "rdfid");
        obj.setCimModel(model);
        var savedObjects = cimClassMap.saveCimObjects(BaseVoltage.class, List.of(obj));
        BaseVoltage savedObj = savedObjects.iterator().next();
        savedBaseVoltageIds.add(savedObj.getId());
        var readObjects = cimClassMap.readCimObjects(BaseVoltage.class, List.of(savedObj.getId()));

        assertNotNull(readObjects);
        BaseVoltage readObj = readObjects.iterator().next();
        assertNotNull(readObj);
        assertEquals(savedObj.getId(), readObj.getId());
    }

    @Test
    @Order(170)
    public void deleteCimObjects() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        BaseClass obj = CimClassMap.createCimObject("BaseVoltage", "rdfid");
        obj.setCimModel(model);
        var savedObjects = cimClassMap.saveCimObjects("BaseVoltage", List.of(obj));
        BaseClass savedObj = savedObjects.iterator().next();
        cimClassMap.deleteCimObjects("BaseVoltage", List.of(savedObj.getId()));

        assertFalse(baseVoltageRepository.existsById(savedObj.getId()));
    }

    @Test
    @Order(180)
    public void deleteCimObjectsWithType() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        BaseVoltage obj = CimClassMap.createCimObject(BaseVoltage.class, "rdfid");
        obj.setCimModel(model);
        var savedObjects = cimClassMap.saveCimObjects(BaseVoltage.class, List.of(obj));
        BaseVoltage savedObj = savedObjects.iterator().next();
        cimClassMap.deleteCimObjects(BaseVoltage.class, List.of(savedObj.getId()));

        assertFalse(baseVoltageRepository.existsById(savedObj.getId()));
    }
}
