package assignment;
import java.util.Scanner;
public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        int rem;
        int q=0;
        int originalnum;
        originalnum = num;
        while(originalnum!=0){
            rem = originalnum%10;
            q = q + rem*rem*rem;
            originalnum /= 10;
        }
        if(q == num){
            System.out.println("Enter the number is Armstrong number "+q);
        }
        else{
            System.out.println("Enter the number is not Armstrong number "+q);
        }
    }
}

