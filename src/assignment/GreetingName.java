package assignment;
import java.util.Scanner;
public class GreetingName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.next();
        System.out.println("Welcome"+" "+name);
    }
}
