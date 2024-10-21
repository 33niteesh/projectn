package com.projectn.nks;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/get")
    public String getMethodName(@RequestParam String param) {   
        return "Hello, " + param+" How are you ";
    }

    @PostMapping("/post")
    public String postMethodName(@RequestBody String entity) {
        return entity;
    }

}