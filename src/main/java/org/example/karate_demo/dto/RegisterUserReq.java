package org.example.karate_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserReq {

    private String firstName;
    private String lastName;
    private Integer birthYear;


}
