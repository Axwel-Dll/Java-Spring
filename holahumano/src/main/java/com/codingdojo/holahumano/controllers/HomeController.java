package com.codingdojo.holahumano.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    @GetMapping("/")
    public String getDefaultName(@RequestParam(defaultValue = "Humano") String name) {
        return "Hola, " + name + "!";
    }
}
