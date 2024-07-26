package assignment;
import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        if(num % 4 ==0 && num % 100 == 0 && num % 400 == 0){
            System.out.println("Enter the year is leap year");
        }
        else{
            System.out.println("Enter the year is not a leap year");
        }
    }
}
