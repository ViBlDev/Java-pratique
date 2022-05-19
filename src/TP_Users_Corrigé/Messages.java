package TP_Users_Corrigé;

public class Messages {
    public static void  LoginSuccess(User user){
        System.out.println("***********");
        System.out.println("*Bienvenue*");
        System.out.println("**********");
        System.out.printf("ID : %s\nNom : %s\nPrenom : %s\nEmail : %s\n",user.getId(),
                user.getLname()
                ,user.getFname(),user.getEmail());

    }

    public static void loginFailure(){
        System.out.println("Email et/ou mot de passe incorrects");
    }
}

