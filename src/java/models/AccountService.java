
package models;

import java.io.Serializable;

public class AccountService implements Serializable {
    
    private final String ABE = "adam";
    private final String BARB = "betty";
    private final String PSWD = "password";
    
    public AccountService () {
        
    }
    
    public User login (String usernameUserJB, String passwordUserJB) {
        if ((usernameUserJB.equals(ABE) || usernameUserJB.equals(BARB)) && passwordUserJB.equals(PSWD)) {
            return new User(usernameUserJB, null);
        }
        return null;
    }
}