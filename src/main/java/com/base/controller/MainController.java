package com.base.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(value="/get")
    public ResponseEntity<String> wishController(){
        return ResponseEntity.ok("Welcome User");
    }

    @GetMapping(value="/bye")
    public ResponseEntity<String> goodBye(){
        return ResponseEntity.ok("Good bye User");
    }
}
