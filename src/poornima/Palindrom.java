package poornima;
import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = sc.next();
        String  rev = "";
        for(int i = name.length()-1; i>=0; i--){
            rev = rev + name.charAt(i);
        }
        if(name.equals(rev)){
            System.out.println("Yes enter the character is a palindrome");
        }
        else {
            System.out.println("No, enter the string is not palindrome");
        }

    }
}
