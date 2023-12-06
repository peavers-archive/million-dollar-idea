package com.bit.ogregapi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String sayHello(){
        return "Hello Mathis, this is Albert. I´m just testing it 3 :)";
    }
}
