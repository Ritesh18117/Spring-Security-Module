package com.security.Spring.Security.Module.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellerController {

    @GetMapping("/seller")
    public String getSeller(){
        return "I am from Seller";
    }
}
