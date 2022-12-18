package com.koala.skillstree.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//pour definir cette classe comme controller
@Controller
//@RequestMapping("/student")
public class LoginController {
//    pour definir cette function comme lien
    @GetMapping(value = "/")
//    Pour retourner la valeur string dans le body, on ajoute l'annotation @Responsebody
    public String loginPage(){
         return "Login";
    }


}
