package TP_Users_Corrigé;

import java.util.ArrayList;

public class UsersSeed {
        public static ArrayList<User> populateUsers(){
            var users=new ArrayList<User>();
//        String fname=input.nextLine();
//        String lname=input.nextLine();
//        String password=input.nextLine();
//        String email=input.nextLine();
//        users.add(new User(fname,lname,email,
//                password));
            users.add(new User("Christian","Lisangola","christian.lisangola@gmail.com",
                    "12345678"));
            users.add(new User("Pierre","Sabourin","sabourinpierre@orange.fr","12345678"));
            users.add(new User("Céline","Darras","cdarras.co@orange.fr","12345678"));
            users.add(new User("Dayann","Deshayes","dayann@hormail.fr","12345678"));
            return users;
        }
}

