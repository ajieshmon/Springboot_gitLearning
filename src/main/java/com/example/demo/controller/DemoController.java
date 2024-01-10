package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/shoeMsg")
    public String showMessage() {
        return "Hai Hello";
    }


    @GetMapping("/displayMsg")
    public String displayMessage() {
        return "Welcome";
    }

}