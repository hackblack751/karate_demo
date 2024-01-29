package org.example.karate_demo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserRes {

    private Integer id;
    private String fullName;
    private Integer birthYear;

}
