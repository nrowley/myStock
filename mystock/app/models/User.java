package models;

import java.security.*;
import algorithm.BCrypt;
import models.DbHandler;

public class User {

    protected String username;
    protected String password;
    protected String email;

    public String getUsername() {return username;}
    public String getPassword(){return password;}
    public String getEmail() {return email;}

    public void hashPassword(){
        setPassword(BCrypt.hashpw(password,BCrypt.gensalt()));
    }

    public boolean checkPwd(){
        //get pwd hash
        String pwdHash = DbHandler.getPassword(this.username);
        if(pwdHash != null){
            //if user exists
            return BCrypt.checkpw(password, pwdHash);
        }
        else{
            //user doesnt exist;
            return false;
        }
    }

    private void setPassword(String password){
        this.password = password;
    }

    
    
}