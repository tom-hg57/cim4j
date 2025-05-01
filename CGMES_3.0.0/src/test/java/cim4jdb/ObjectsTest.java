package cim4jdb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import cim4jdb.main.Application;
import cim4jdb.types.UnitMultiplier;
import cim4jdb.types.WindingConnection;

@SpringBootTest(classes = Application.class)
@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ObjectsTest {

    @Autowired
    private Analog.Repository _analogRepo;
    private Repo<Analog, Analog.Repository> analogRepository;

    @Autowired
    private BaseVoltage.Repository _baseVoltageRepo;
    private Repo<BaseVoltage, BaseVoltage.Repository> baseVoltageRepository;

    @Autowired
    private PowerTransformerEnd.Repository _powerTransformerEndRepo;
    private Repo<PowerTransformerEnd, PowerTransformerEnd.Repository> powerTransformerEndRepository;

    @Autowired
    private SvVoltage.Repository _svVoltageRepo;
    private Repo<SvVoltage, SvVoltage.Repository> svVoltageRepository;

    @Autowired
    private TopologicalNode.Repository _topologicalNodeRepo;
    private Repo<TopologicalNode, TopologicalNode.Repository> topologicalNodeRepository;

    @Autowired
    private TransformerEnd.Repository _transformerEndRepo;
    private Repo<TransformerEnd, TransformerEnd.Repository> transformerEndRepository;

    @Autowired
    private CimModel.Repository cimModelRepository;
    private CimModel model;

    @BeforeEach
    public void cleanDatabase() {
        analogRepository = new Repo<>(_analogRepo);
        baseVoltageRepository = new Repo<>(_baseVoltageRepo);
        powerTransformerEndRepository = new Repo<>(_powerTransformerEndRepo);
        svVoltageRepository = new Repo<>(_svVoltageRepo);
        topologicalNodeRepository = new Repo<>(_topologicalNodeRepo);
        transformerEndRepository = new Repo<>(_transformerEndRepo);
        model = cimModelRepository.save(new CimModel());
    }

    @AfterEach
    public void cleanUpDatabase() {
        analogRepository.cleanUp();
        baseVoltageRepository.cleanUp();
        powerTransformerEndRepository.cleanUp();
        svVoltageRepository.cleanUp();
        topologicalNodeRepository.cleanUp();
        transformerEndRepository.cleanUp();
        cimModelRepository.delete(model);
    }

    @Test
    @Order(100)
    public void createEntryInModel() {
        var obj = new BaseVoltage();
        obj.setCimModel(model);
        obj = baseVoltageRepository.save(obj);

        assertNotNull(obj.getId());
        assertNotNull(obj.getCimModel());
        assertNotNull(obj.getCimType());
        assertEquals("BaseVoltage", obj.getCimType());
        assertTrue(obj instanceof BaseVoltage);

        Long originalId = obj.getId();
        Optional<BaseVoltage> resultOp = baseVoltageRepository.findById(originalId);
        assertTrue(resultOp.isPresent());
        BaseVoltage result = resultOp.get();

        assertEquals(originalId, result.getId());
        assertNotNull(result.getCimModel());
        assertEquals("BaseVoltage", result.getCimType());
    }

    @Test
    @Order(105)
    public void createSuperClassEntriesToo() {
        var obj = new PowerTransformerEnd();
        obj.setCimModel(model);
        obj = powerTransformerEndRepository.save(obj);
        Long originalId = obj.getId();

        Optional<PowerTransformerEnd> resultOp0 = powerTransformerEndRepository.findById(originalId);
        assertTrue(resultOp0.isPresent());

        Optional<TransformerEnd> resultOp1 = transformerEndRepository.findById(originalId);
        assertTrue(resultOp1.isPresent());
    }

    @Test
    @Order(110)
    public void updateEntry() {
        var obj = new BaseVoltage();
        obj.setCimModel(model);
        obj = baseVoltageRepository.save(obj);
        Long originalId = obj.getId();

        assertNull(obj.getRdfid());
        assertNull(obj.getDescription());
        assertNull(obj.getNominalVoltage());

        obj.setRdfid("rdfid");
        obj.setDescription("description");
        obj.setNominalVoltage(42.0);

        BaseVoltage result = baseVoltageRepository.save(obj);

        assertEquals(originalId, result.getId());
        assertEquals("rdfid", result.getRdfid());
        assertEquals("description", result.getDescription());
        assertEquals(42.0, obj.getNominalVoltage());
    }

    @Test
    @Order(120)
    @Transactional
    public void updateEntryWithoutSave() {
        var obj = new BaseVoltage();
        obj.setCimModel(model);
        obj = baseVoltageRepository.save(obj);
        Long originalId = obj.getId();

        assertNull(obj.getRdfid());
        assertNull(obj.getDescription());
        assertNull(obj.getNominalVoltage());

        // Update using setters but no save
        obj.setRdfid("rdfid");
        obj.setDescription("description");
        obj.setNominalVoltage(42.0);

        Optional<BaseVoltage> resultOp = baseVoltageRepository.findById(originalId);
        assertTrue(resultOp.isPresent());
        BaseVoltage result = resultOp.get();

        assertEquals(originalId, result.getId());
        assertEquals("rdfid", result.getRdfid());
        assertEquals("description", result.getDescription());
        assertEquals(42.0, obj.getNominalVoltage());
    }

    @Test
    @Order(140)
    public void writeOneToOne() {
        var topologicalNode = new TopologicalNode();
        topologicalNode.setCimModel(model);
        topologicalNode.setRdfid("rdfid");
        topologicalNode = topologicalNodeRepository.save(topologicalNode);
        var svVoltage = new SvVoltage();
        svVoltage.setCimModel(model);
        svVoltage.setTopologicalNode(topologicalNode);
        svVoltage = svVoltageRepository.save(svVoltage);

        Optional<TopologicalNode> topologicalNodeOp = topologicalNodeRepository.findById(topologicalNode.getId());
        assertTrue(topologicalNodeOp.isPresent());
        assertEquals(topologicalNode.getId(), topologicalNodeOp.get().getId());

        Optional<SvVoltage> svVoltageOp = svVoltageRepository.findById(svVoltage.getId());
        assertTrue(svVoltageOp.isPresent());
        assertEquals(svVoltage.getId(), svVoltageOp.get().getId());
        assertEquals("rdfid", svVoltageOp.get().TopologicalNodeToString());
    }

    @Test
    @Order(150)
    public void writeManyToOne() {
        var baseVoltage = new BaseVoltage();
        baseVoltage.setCimModel(model);
        baseVoltage.setRdfid("rdfid");
        baseVoltage = baseVoltageRepository.save(baseVoltage);
        var topologicalNode1 = new TopologicalNode();
        var topologicalNode2 = new TopologicalNode();
        topologicalNode1.setCimModel(model);
        topologicalNode2.setCimModel(model);
        topologicalNode1.setBaseVoltage(baseVoltage);
        topologicalNode2.setBaseVoltage(baseVoltage);
        topologicalNode1 = topologicalNodeRepository.save(topologicalNode1);
        topologicalNode2 = topologicalNodeRepository.save(topologicalNode2);

        Optional<BaseVoltage> baseVoltageOp = baseVoltageRepository.findById(baseVoltage.getId());
        assertTrue(baseVoltageOp.isPresent());
        assertEquals(baseVoltage.getId(), baseVoltageOp.get().getId());

        Optional<TopologicalNode> topologicalNodeOp = topologicalNodeRepository.findById(topologicalNode1.getId());
        assertTrue(topologicalNodeOp.isPresent());
        assertEquals(topologicalNode1.getId(), topologicalNodeOp.get().getId());
        assertEquals("rdfid", topologicalNodeOp.get().BaseVoltageToString());

        topologicalNodeOp = topologicalNodeRepository.findById(topologicalNode2.getId());
        assertTrue(topologicalNodeOp.isPresent());
        assertEquals(topologicalNode2.getId(), topologicalNodeOp.get().getId());
        assertEquals("rdfid", topologicalNodeOp.get().BaseVoltageToString());
    }

    @Test
    @Order(170)
    public void writePrimitiveAttributes() {
        TransformerEnd obj = new TransformerEnd();
        obj.setCimModel(model);
        obj = transformerEndRepository.save(obj);
        Long originalId = obj.getId();

        assertNull(obj.getEndNumber());
        assertNull(obj.getGrounded());
        assertNull(obj.getRground());
        assertNull(obj.getXground());

        obj.setEndNumber(0);
        obj.setGrounded(true);
        obj.setRground(4.2);
        obj.setXground(0.0);

        TransformerEnd result = transformerEndRepository.save(obj);

        assertEquals(originalId, result.getId());
        assertEquals(0, result.getEndNumber());
        assertTrue(result.getGrounded());
        assertEquals(4.2, obj.getRground());
        assertEquals(0.0, obj.getXground());
    }

    @Test
    @Order(180)
    public void writeEnumAttributes() {
        PowerTransformerEnd obj = new PowerTransformerEnd();
        obj.setCimModel(model);
        obj = powerTransformerEndRepository.save(obj);
        Long originalId = obj.getId();

        assertNull(obj.getConnectionKind());

        var connection = WindingConnection.fromString("I");
        obj.setConnectionKind(connection.toString());

        PowerTransformerEnd result = powerTransformerEndRepository.save(obj);

        assertEquals(originalId, result.getId());
        assertEquals("I", result.getConnectionKind());
    }

    @Test
    @Order(190)
    public void writeEnumAttributesWithDuplicates() {
        Analog obj = new Analog();
        obj.setCimModel(model);
        obj = analogRepository.save(obj);
        Long originalId = obj.getId();

        assertNull(obj.getUnitMultiplier());

        obj.setUnitMultiplier(UnitMultiplier._M.toString());

        Analog result = analogRepository.save(obj);

        assertEquals(originalId, result.getId());
        assertEquals("M", result.getUnitMultiplier());
        assertNotEquals("m", result.getUnitMultiplier());

        obj.setUnitMultiplier(UnitMultiplier._m.toString());

        result = analogRepository.save(obj);

        assertEquals(originalId, result.getId());
        assertEquals("m", result.getUnitMultiplier());
        assertNotEquals("M", result.getUnitMultiplier());
    }

    /**
     * Generic helper class to clean up the database after each test.
     */
    private class Repo<T extends BaseClass, R extends CrudRepository<T, Long>> {
        private R repository;
        private HashSet<Long> savedIds = new HashSet<>();

        public Repo(R repo) {
            repository = repo;
        }

        public T save(T obj) {
            var saved = repository.save(obj);
            savedIds.add(saved.getId());
            return saved;
        }

        public Optional<T> findById(Long id) {
            return repository.findById(id);
        }

        public void cleanUp() {
            repository.deleteAllById(savedIds);
        }
    }
}
