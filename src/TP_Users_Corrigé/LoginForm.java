package TP_Users_Corrigé;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginForm {
    private String email;
    private String password;

//    Pas de getter pour users parce que c'est une dépendance externe qui represent la
//    base de données

    public LoginForm(String email, String password) {
        this.email = email;
        this.password = password;
    }



    //    Scenario de voir son email
    public String getEmail() {
        return email;
    }

    //    Scenario de modifier son email
    public void setEmail(String email) {
        this.email = email;
    }


    //    Scenario de voir son mot de passe
    public String getPassword() {
        return password;
    }

    //        Scenario de modifier son mot de passe
    public void setPassword(String password) {
        this.password = password;
    }


    public boolean isValid(){
//        Trop Long
//        if(Validator.isEmail(this.email) && Validator.isLength(this.password,
//                Constantes.MIN_PASSWORD_LENGTH,Constantes.MAX_PASSWORD_LENGTH)){
//            return true;
//        }
//        return false;
        return Validator.isEmail(this.email) && !Validator.isEmpty(this.password);
    }


}