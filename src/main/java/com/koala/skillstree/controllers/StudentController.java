package com.koala.skillstree.controllers;

import com.koala.skillstree.services.LoginService;
import com.koala.skillstree.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//pour definir cette classe comme controller
@Controller
//@RequestMapping("/student")
public class StudentController {
//    declare class and use autowired to use this object from LoginService
    @Autowired
    StudentService studentService;
//    pour definir cette function comme lien
    @GetMapping(value = "/students")
//    Pour retourner la valeur string dans le body, on ajoute l'annotation @Responsebody
    public String showStudentPage(ModelMap modelMap){
         modelMap.addAttribute("student",studentService.readAllStudent());
         return "Student";
    }

}
