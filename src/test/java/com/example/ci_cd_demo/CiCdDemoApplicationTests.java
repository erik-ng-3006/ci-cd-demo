package com.example.ci_cd_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CiCdDemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
    void testHelloEndpoint() {
        String expected = "Hello, CI/CD!";
        assertEquals(expected, "Hello, CI/CD!");
    }

}
