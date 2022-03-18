package com.example.diagnostic_service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiagnosticController {

    @GetMapping("/diagnostic")
    public String greatings(){
        return "hi from Diagnostic service";
    }

}
