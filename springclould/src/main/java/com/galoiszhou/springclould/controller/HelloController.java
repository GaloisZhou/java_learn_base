package com.galoiszhou.springclould.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
public class HelloController {

    // get property from application.properties
    @Value("${my.name}")
    private String name;

    @ApiIgnore
    @RequestMapping("/hello")
    public String hello() {
        return "Greeting from spring boot";
    }

}
