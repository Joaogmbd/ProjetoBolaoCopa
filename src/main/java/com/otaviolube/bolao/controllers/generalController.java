package com.otaviolube.bolao.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class generalController {

    @GetMapping(value="/dashboard")
    public String teste_dashboard(){
        return "dashboard";
    }
    
}
