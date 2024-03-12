package com.vunh.lab2;

import java.util.HashMap;

public class Login {

    public String loginTo(HashMap<String, String> account, String username, String password){
        if(account.containsKey(username)){
            String passwordStore = account.get(username);
            if(passwordStore.equals(password)){
                return "Login successfully";
            }else{
                return "Login fail";
            }
        }else {
            return "Account not found";
        }
    }
}
