package com.otaviolube.bolao.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class generalController {

    @GetMapping(value="/dashboard")
    public String teste_dashboard(){
        return "dashboard";
    }
    @RequestMapping(value="/jogos" )
    public String jogos(){
        return"fragments/jogos.html";
    }
}
