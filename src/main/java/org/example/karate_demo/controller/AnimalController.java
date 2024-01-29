package org.example.karate_demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/animal")
public class AnimalController {

    private static final String[] animals;
    static {
        animals = new String[] {"cat", "dog", "chicken", "tiger", "shark", "lion", "hopper"};
    }

    @GetMapping
    public ResponseEntity<?> searchAnimal(@RequestParam(required = false) String name) {
        String foundAnimal = null;
        for(String animal : animals) {
            if(animal.equalsIgnoreCase(name)) foundAnimal = animal;
        }
        Map<String, String> response = new HashMap<>();
        if(foundAnimal == null)
            return ResponseEntity.notFound().build();

        response.put("animal", foundAnimal);

        return ResponseEntity.ok(response);
    }

}
