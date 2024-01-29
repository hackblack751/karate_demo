package org.example.karate_demo.controller;

import org.example.karate_demo.dto.RegisterUserReq;
import org.example.karate_demo.dto.RegisterUserRes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/register")
public class RegisterController {

    @PostMapping
    public ResponseEntity<?> registerUser(@RequestBody RegisterUserReq requestBody) {
        RegisterUserRes response = new RegisterUserRes();
        response.setId(1);
        response.setFullName(requestBody.getFirstName() + " " + requestBody.getLastName());
        response.setBirthYear(requestBody.getBirthYear());
        return ResponseEntity.ok(response);
    }

}
