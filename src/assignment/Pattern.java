package assignment;
import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j;
//        for(i=1; i<=4; i++){
//            for(j= 1; j<=5; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //hollow rectangle
//        //outer shell
//        for(i=1; i<=4; i++){
//            //inner shell
//            for(j=1; j<=5; j++){
//                if(j==1 || j==5 ||i==1 || i==4){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

         //Half pyramid
        for(i=1; i<=5; i++){
            for(j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

//       //inverted half pyramid
//        for(i=1; i<=5; i++){
//            for(j=5; j>=i; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        //outer loop
//        for(i=1; i<=5; i++){
//            //inner loop -> spaces print
//            for(j=1; j<=5-i; j++){
//                System.out.print("  ");
//            }
//            //inner loop -> star print
//            for(j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



    }
}
