package assignment;
import java.util.Scanner;
public class LcmHcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the two num. : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int temp;
        int Hcf ;
        int Lcm;
        int x,y;
        x = num1;
        y = num2;
        while (y!=0){
            temp = y;
            y = x%y;
            x = temp;
        }
        Hcf = x;
        Lcm = (num1*num2)/Hcf;
        System.out.print("Hcf of num1 and num2 = ");
        System.out.println(Hcf);
        System.out.print("Lcm of num1 and num2 = ");
        System.out.println(Lcm);
    }
}
