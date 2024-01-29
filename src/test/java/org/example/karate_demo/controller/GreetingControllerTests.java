package org.example.karate_demo.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetingControllerTests {

    @Autowired
    private TestRestTemplate template;

    @Test
    public void helloTest(){
        // send the request...
        String url = "/api/hello";
        ResponseEntity<String> response = template.getForEntity(url, String.class);

        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
        String str = response.getBody();
        Assertions.assertEquals("Hello world!", str, "expected Id to be 0");
    }
}
