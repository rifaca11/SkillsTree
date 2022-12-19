package com.koala.skillstree.controllers;

import com.koala.skillstree.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

//pour definir cette classe comme controller
@Controller
//@RequestMapping("/student")
public class LoginController {
//    declare class and use autowired to use this object from LoginService
    @Autowired
    LoginService loginService;
//    pour definir cette function comme lien
    @GetMapping(value = "/")
//    Pour retourner la valeur string dans le body, on ajoute l'annotation @Responsebody
    public String loginPage(){
         return "Login";
    }
    @PostMapping(value = "/")
//    Pour retourner la valeur string dans le body, on ajoute l'annotation @Responsebody
    public String GetHomePage(@RequestParam String email, @RequestParam String password, ModelMap modelMap){
        if(loginService.checkalidateUser(email, password)){
            modelMap.put("email",email);
            modelMap.put("password",password);
            return "Home";
        }
        else {
            modelMap.put("error_msg","Check your email or password");
            return "Login";
        }

    }

}
