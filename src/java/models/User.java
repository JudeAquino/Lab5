/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author 809562
 */
public class User implements Serializable {
       
   private String usernameUserJB;
   private String passwordUserJB;

    public User() {
        this.usernameUserJB="";
        this.passwordUserJB="";
    }

    User(String usernameJB, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
 
    public void User(String constructorUsernameUserJB, String constructorPasswordUserJB) {
        this.usernameUserJB=constructorUsernameUserJB;
        this.passwordUserJB=constructorPasswordUserJB;
    }

    public String getPasswordUserJB() {
        return passwordUserJB;
    }

    public void setPasswordUserJB(String setPasswordUserJB) {
        this.passwordUserJB = setPasswordUserJB;
    }

    public String getUsernameUserJB() {
        return usernameUserJB;
    }

  public void setUsernameUserJB(String setUsernameUserJB) {
        this.usernameUserJB = setUsernameUserJB;
    }
}