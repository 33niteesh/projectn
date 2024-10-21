package com.projectn.nks;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/get")
    public String getMethodName(@RequestParam String param) {
        return "Hello, " + param;
    }

}