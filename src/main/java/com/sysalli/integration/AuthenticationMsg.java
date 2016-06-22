package com.sysalli.integration;

/**
 * Created by dandrews on 6/21/16.
 */
public class AuthenticationMsg {
    private String username;
    private Boolean authenticated;

    public AuthenticationMsg(String username, Boolean authenticated){
        this.username = username;
        this.authenticated = authenticated;
    }

    public String getUsername(){
        return this.username;
    }

    public Boolean isAuthenticated(){
        return this.authenticated;
    }

}
