/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.beans.*;
import java.io.Serializable;


public class AccountService implements Serializable {
    
    final String adam  = "adam";
    final String betty = "betty";
    final String password= "password";
          public AccountService () {
        
    }
   public User login(String usernameJB,String passwordJB) {
            User user = new User(usernameJB,passwordJB);
            
       if(usernameJB.equals(adam) || usernameJB.equals(betty) && passwordJB.equals(password)) {
       return user;
        }
       else if (usernameJB.equals(betty) && passwordJB.equals(password)) {
            return user;
               } else {
       return null;
    }
    } 
} 