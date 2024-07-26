package assignment;
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        int mult;
        for(int i =1; i<=10; i++){
            mult = num*i;
            System.out.print(num);
            System.out.print(" *");
            System.out.print(i);
            System.out.print(" = ");
            System.out.print(mult);
            System.out.println();
        }
    }
}
