package com.example.doctor_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @GetMapping("/getDoctor")
    public String greatings(){
        return "Hi from Doctor service!";
    }

    @GetMapping("/wish/{name}")
    public String wishToSpecialDoctor(@PathVariable String name){
        return "i with to get a doctor who name is "+ name + "please";
    }

}
