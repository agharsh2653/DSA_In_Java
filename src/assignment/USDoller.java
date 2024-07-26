package assignment;
import java.util.Scanner;
public class USDoller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER THE AMOUNT OF CURRENCY : ");
        int rup = in.nextInt();
        double USD ;
        USD = rup*0.012;
        System.out.println("Currency in USD is "+USD);
    }
}
