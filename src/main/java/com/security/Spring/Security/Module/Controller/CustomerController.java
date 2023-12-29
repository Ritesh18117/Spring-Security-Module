package com.security.Spring.Security.Module.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/customer")
    public String getCustomer(){
        return "I am from customer!!";
    }
}
