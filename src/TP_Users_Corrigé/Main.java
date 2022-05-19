package TP_Users_Corrigé;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> database= UsersSeed.populateUsers();
//      Création du compte
        System.out.println("*****************");
        System.out.println("*Enregistrement*");
        System.out.println("*****************");



//        Authentification
        System.out.println("*****************");
        System.out.println("*Identifiez-vous*");
        System.out.println("*****************");

        var input=new Scanner(System.in);
        var nombreTentatives=5;

        while (true){
            System.out.print("Email : ");
            String email=input.nextLine();

            System.out.print("Mot de passe : ");
            String password=input.nextLine();

            var loginForm=new LoginForm(email,password);

            if(loginForm.isValid()){
                User signedInUser=Auth.signin(loginForm,database);
                if(signedInUser!=null){
                    Messages.LoginSuccess(signedInUser);
                    break;
                }
                continue;
            }else{
                Messages.loginFailure();
            }
        }

    }
}