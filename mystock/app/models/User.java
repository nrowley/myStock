package models;

import java.security.*;
import algorithm.BCrypt;

public class User {

    protected String username;
    protected String password;
    protected String email;

    public void AddToDb(){
        
    }


    public String getUsername() {return username;}
    public String getPassword(){return password;}
    public String getEmail() {return email;}

    public void hashPassword(){
        setPassword(BCrypt.hashpw(password,BCrypt.gensalt()));
    }

    private void setPassword(String password){
        this.password = password;
    }
    
}