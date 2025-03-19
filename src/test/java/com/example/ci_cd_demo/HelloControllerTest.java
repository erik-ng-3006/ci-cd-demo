package com.example.ci_cd_demo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class HelloControllerTest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    void testHelloEndpoint() {
        String response = restTemplate.getForObject("http://localhost:8080/hello", String.class);
        assertThat(response).isEqualTo("Hello, World!");
    }
}

