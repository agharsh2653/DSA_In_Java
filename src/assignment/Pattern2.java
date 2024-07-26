package assignment;
import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        int i,j;
        //0-1 Triangle
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                int sum =i+j;
                if(sum%2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
//        int number=1;
//        //Floyd`s triangle
//        for(i=1; i<=5; i++){
//            for(j=1; j<=i; j++){
//                System.out.print(number);
//                number++;
//            }
//            System.out.println();
//        }

//        //Half pyramid with number
//        for(i=1; i<=5; i++){
//            for(j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//
//        for(i=1; i<=5; i++){
//            for(j=1; j<=5-i+1; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

    }
}
