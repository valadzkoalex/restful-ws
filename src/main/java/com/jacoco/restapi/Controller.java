package com.jacoco.restapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/greet")
    public ResponseEntity<String> greet(@RequestParam(value = "name") String name) {
        if(name.equals("John")) {
            return ResponseEntity.ok(String.format("Your name is wonderful, congratulations %s", name));
        }
        return ResponseEntity.ok(String.format("Hello %s!", name));
    }
}