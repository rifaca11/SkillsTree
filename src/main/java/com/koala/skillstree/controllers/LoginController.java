package com.koala.skillstree.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//pour definir cette classe comme controller
@Controller
@RequestMapping("/Student")
public class LoginController {
//    pour definir cette function comme lien
    @GetMapping(value = "/login")
//    Pour retourner la valeur dans le body
    public String loginPage(){
        return "KOALA";
    }

}
