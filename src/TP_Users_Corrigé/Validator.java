package TP_Users_Corrigé;

import java.util.regex.Pattern;

public class Validator {
    public static boolean isEmail(String email){
        return Pattern.matches(".+@.+\\..+", email);
    }

    public static boolean isLength (String str,int min,int max){
        return str.length()>=min && str.length()<=max;
    }

    public static boolean isEmpty(String str){
        return str.length()==0;
    }
}