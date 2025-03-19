package com.example.ci_cd_demo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class HelloControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

   @Test
    void testHelloEndpoint() {
        // Ensure the URL is correct
        String response = restTemplate.getForObject("/api/helloworld", String.class);
        assertThat(response).isEqualTo("Hello, World!");
    }
}

