package com.koala.skillstree.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
//    Function to validate login
    public boolean checkalidateUser(String email, String password){
        if(email.equals("charifa@gmail.com")&& password.equals("123")){
            return true;
        }
        else {
            return false;
        }
    }
}
