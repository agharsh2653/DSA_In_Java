package assignment;
import java.util.Scanner;
public class SumNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int N, sum=0;
        for(int i = 1; i<=num; i++){
            System.out.print("Enter "+i +" number: ");
            N = in.nextInt();
            sum = sum+N;
        }
        System.out.println("Sum = "+sum);
    }
}
