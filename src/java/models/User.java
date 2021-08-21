/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

public class User implements Serializable {
    private String usernameUserJB;
    private String passwordUserJB;
    
    public User () {
        
    }
    
    public User (String usernameUserJB, String passwordUserJB) {
        this.usernameUserJB = usernameUserJB;
        this.passwordUserJB = passwordUserJB;
    }

    public String getPasswordUserJB() {
        return passwordUserJB;
    }

    public String getUsernameUserJB() {
        return usernameUserJB;
    }
}