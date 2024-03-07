package com.example.servlethelloworld;

import java.util.HashMap;

public class LoginModel {
    public static String loginHashMap(HashMap<String, String> account, String username, String password) {
        if(account.containsKey(username)){
            String storedPassword = account.get(username);
            if(password.equals(storedPassword)){
                return "Login to " + username;
            }else{
                return "Login failed";
            }
        }else{
            return "Account not found";
        }
    }
}
