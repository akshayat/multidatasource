package com.foo.bar.car;

import com.foo.bar.car.utils.KSUIDGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureTestDatabase
// https://stackoverflow.com/a/58786742/1534925
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
class CarApplicationTests {

    @Test
    public void contextLoads() {
        String h = "Hello World!";
        Assertions.assertEquals(h, "Hello World!");
    }

    @Test
    public void testKSUIDGeneration() {
        Assertions.assertNotNull(KSUIDGenerator.generateKSUID());
    }
}
