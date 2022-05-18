import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {



    public static boolean isEmail(String email){
        return Pattern.matches(".+@.+\\..+", email);
}

    public static boolean isLength(String mdp){
        return mdp.length() >= 8 && mdp.length()<=20;
    }

    public static boolean checkUser(ArrayList<Users> users, String email, String password){
        for (Users user: users
        ) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)){
                System.out.println("okok");
                return true;
            }
        }
        return false;
    }

}
