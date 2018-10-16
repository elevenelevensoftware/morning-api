package com.example.api_morning_v1.controller;

import com.example.api_morning_v1.model.Mammal;
import com.example.api_morning_v1.service.MorningServce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MorningController {

    @Autowired
    private MorningServce morningServce;

    @GetMapping("/mainendpoint")
    public List<Mammal> mainendpoint(){
        return morningServce.getMammals();
    }
}
