package cim4jdb.main;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class)
@TestInstance(Lifecycle.PER_CLASS)
class ApplicationTests {

    @Test
    void contextLoads() {
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println(String.format("maxMemory = %d (%d MByte)", maxMemory, maxMemory / (1024 * 1024)));
    }
}
