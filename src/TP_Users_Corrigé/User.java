package TP_Users_Corrigé;

import java.util.UUID;

public class User {
    private String id;
    private String fname;
    private String lname;
    private String email;
    private String password;
    //POJO : Plain old Java Object
    public User(String fname, String lname, String email, String password) {
        this.id= UUID.randomUUID().toString();
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}

