package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9
         */
        //definition of 2D Array
        //int[][] matrix = new int[3][3];
        int[][] arr2D = { {1,2,3}, //0th index
                          {4,5},   //1st index
                          {6,7,8,9} //2nd index  arr2D[2] = {6,7,8,9}
        };
//        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
//        for(int i=0; i<3; i++){
//            for(int j=0; j<3; j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }

        int[][] arr = new int[3][3];
        System.out.println(arr.length); //no of rows
        //input

        for(int row =0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                arr[row][col] = in.nextInt();
                //System.out.print(arr[row][col]+" ");
            }
            //System.out.println();
        }


        //output
//        for(int row = 0; row < arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
