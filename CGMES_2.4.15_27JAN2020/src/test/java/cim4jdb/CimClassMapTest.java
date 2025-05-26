package cim4jdb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;

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
    public void saveCimObject() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        BaseClass obj = CimClassMap.createCimObject("BaseVoltage", "rdfid");
        assertNull(obj.getId());
        obj.setCimModel(model);
        BaseClass savedObj = cimClassMap.saveCimObject("BaseVoltage", obj);

        assertNotNull(savedObj);
        assertNotNull(savedObj.getId());
        savedBaseVoltageIds.add(savedObj.getId());
        assertEquals(BaseVoltage.class, savedObj.getClass());
    }

    @Test
    @Order(140)
    public void saveCimObjectWithType() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        BaseVoltage obj = CimClassMap.createCimObject(BaseVoltage.class, "rdfid");
        assertNull(obj.getId());
        obj.setCimModel(model);
        BaseVoltage savedObj = cimClassMap.saveCimObject(BaseVoltage.class, obj);

        assertNotNull(savedObj);
        assertNotNull(savedObj.getId());
        savedBaseVoltageIds.add(savedObj.getId());
    }

    @Test
    @Order(150)
    public void readCimObject() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        BaseClass obj = CimClassMap.createCimObject("BaseVoltage", "rdfid");
        obj.setCimModel(model);
        BaseClass savedObj = cimClassMap.saveCimObject("BaseVoltage", obj);
        savedBaseVoltageIds.add(savedObj.getId());
        BaseClass readObj = cimClassMap.readCimObject("BaseVoltage", savedObj.getId());

        assertNotNull(readObj);
        assertEquals(savedObj.getId(), readObj.getId());
        assertEquals(BaseVoltage.class, readObj.getClass());
    }

    @Test
    @Order(160)
    public void readCimObjectWithType() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        BaseVoltage obj = CimClassMap.createCimObject(BaseVoltage.class, "rdfid");
        obj.setCimModel(model);
        BaseVoltage savedObj = cimClassMap.saveCimObject(BaseVoltage.class, obj);
        savedBaseVoltageIds.add(savedObj.getId());
        BaseVoltage readObj = cimClassMap.readCimObject(BaseVoltage.class, savedObj.getId());

        assertNotNull(readObj);
        assertEquals(savedObj.getId(), readObj.getId());
    }

    @Test
    @Order(170)
    public void deleteCimObject() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        BaseClass obj = CimClassMap.createCimObject("BaseVoltage", "rdfid");
        obj.setCimModel(model);
        BaseClass savedObj = cimClassMap.saveCimObject("BaseVoltage", obj);
        cimClassMap.deleteCimObject("BaseVoltage", savedObj.getId());

        assertFalse(baseVoltageRepository.existsById(savedObj.getId()));
    }

    @Test
    @Order(180)
    public void deleteCimObjectWithType() {
        var model = cimModelRepository.save(new CimModel());
        savedModelIds.add(model.getCimModelId());

        BaseVoltage obj = CimClassMap.createCimObject(BaseVoltage.class, "rdfid");
        obj.setCimModel(model);
        BaseVoltage savedObj = cimClassMap.saveCimObject(BaseVoltage.class, obj);
        cimClassMap.deleteCimObject(BaseVoltage.class, savedObj.getId());

        assertFalse(baseVoltageRepository.existsById(savedObj.getId()));
    }
}
