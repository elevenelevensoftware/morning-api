package com.example.api_morning_v1;

import com.example.api_morning_v1.controller.MorningController;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiMorningV1ApplicationTests {

    @Autowired
    private MorningController morningController;

    @Test
    public void contextLoads() {
        assertThat(morningController).isNotNull();
    }
}
