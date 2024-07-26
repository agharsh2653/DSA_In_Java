package assignment;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the value ");
        System.out.print("p = ");
        int p = in.nextInt();
        System.out.print("R = ");
        int r = in.nextInt();
        System.out.print("t = ");
        int t = in.nextInt();
        int SI;
        SI = p*r*t/100;
        System.out.println("Simple Interest is "+SI);
    }
}
