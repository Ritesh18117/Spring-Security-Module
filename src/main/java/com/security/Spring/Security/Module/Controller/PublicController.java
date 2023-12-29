package com.security.Spring.Security.Module.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {

    @GetMapping("/public")
    public String getPublic(){
        return "I am from public";
    }
}
