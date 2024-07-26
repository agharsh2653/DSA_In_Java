package poornima;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int  fact = 1;
        for(int i =num; i>0; i--){
          fact = fact*i;
        }
        System.out.println("Factorial of a number is "+fact);
    }
}
