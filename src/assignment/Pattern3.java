package assignment;
import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j;
        int n=5;
        //Rhombus
//        for(i=1; i<=5; i++){
//            //inner loop -> spaces print
//            for(j=1; j<=5-i; j++){
//                System.out.print("  ");
//            }
//            //inner loop -> star print
//            for(j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            for(j=6; j>=i; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for(i=5; i>=1; i--){
            //inner loop -> spaces print
            for(j=1; j<i; j++){
                System.out.print(" ");
            }
            //inner loop -> star print
            for(j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for(i=n; i>=1; i--) {
            for(j=1; j<i; j++) {
                System.out.print(" ");
            }
            for(j=0; j<=n-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
