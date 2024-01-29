package org.example.karate_demo.controller;

import org.example.karate_demo.dto.ResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public ResponseEntity<?> demoResponse() {
        ResponseDto response = new ResponseDto("Hello", "200");
        return ResponseEntity.ok(response);
    }


}
