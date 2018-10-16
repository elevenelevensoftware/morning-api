package com.example.api_morning_v1.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class MorningControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private ResponseEntity<String> entity;

    @Before
    public void setUp() throws Exception {
        entity = restTemplate.exchange("/mainendpoint", HttpMethod.GET, new HttpEntity<>(new HttpHeaders()), String.class);
    }

    @Test
    public void receives_a_2xx_type_okay_status() {
        assertThat(entity.getStatusCode().value()).isEqualTo(200);
    }

    @Test
    public void receives_a_body() {
        assertThat(entity.getBody()).isEqualTo("[{\"animal\":\"Dog\"}]");
    }
}
