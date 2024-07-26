package String;

import java.util.Locale;

public class Palin {
    public static void main(String[] args){
        String str = "ha";
        Boolean ans = isPalindrome(str);
        if(ans == false){
            System.out.println("String is not palindrom");
        }
        else{
            System.out.println("String is Palindrom");
        }
    }

    static boolean isPalindrome(String str){
        if(str.length() == 0 || str == null){
            return true;
        }
        str = str.toLowerCase();
        for(int i=0; i<str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if(start != end){
                return false;
            }

        }
        return true;
    }
}
