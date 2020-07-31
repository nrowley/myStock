package models;


public class User {

    protected String username;
    protected String password;
    protected String email;
    protected String pwdHash;

    public void AddToDb(){
        
    }


    public String getUsername() {return username;}
    public String getPasswordUnhashed(){return password;}
    public String getEmail() {return email;}

    private String hashPassword(){
        
    }
    
}