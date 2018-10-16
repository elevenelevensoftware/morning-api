package com.example.api_morning_v1.service;

import com.example.api_morning_v1.model.Mammal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MorningServce {

    public List<Mammal> getMammals() {
        List<Mammal> mammals = new ArrayList<>();
        Mammal mammal = new Mammal("Dog");
        mammals.add(mammal);
        return mammals;
    }
}
