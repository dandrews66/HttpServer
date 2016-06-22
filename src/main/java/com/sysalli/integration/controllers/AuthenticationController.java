package com.sysalli.integration.controllers;

import com.sysalli.integration.AuthenticationMsg;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dandrews on 6/21/16.
 */
@RestController
public class AuthenticationController {

    @RequestMapping("/authenticate")
    public AuthenticationMsg authenticate(@RequestParam(value="username") String username, @RequestParam(value="password") String password) {
        if(username != null && password != null){
            return new AuthenticationMsg(username, true);
        }
        else{
            return new AuthenticationMsg(username, false);
        }
    }
}
