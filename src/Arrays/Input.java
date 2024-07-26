package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0]  =  23;
        arr[1] = 65;
        arr[2] = 234;
        arr[3] = 90;
        arr[4] = 12;
        //[23, 65, 234, 90, 12];
        System.out.println(arr[2]);

        //input using for loop
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
 
//        for(int num : arr){ //for every element in an array print all element
//            System.out.print(num + " "); // hare num represent of the array
//        }

        //array of objects
        String[] str = new String[4];
        for (int i=0; i<str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "Harsh";
        str[0] = "Kunal";
        System.out.println(Arrays.toString(str));
    }
}
