package com.security.Spring.Security.Module.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @GetMapping("/admin")
    public String getAdmin(){
        return "I am from Admin";
    }
}
