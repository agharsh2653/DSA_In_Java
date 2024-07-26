package Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        //data type[] variable_name = new datatype[name];
        //int[] rol = new int[5];
        int[] roln = {22, 34, 15, 75, 89};
        int[] rol; //declaration of array. ros is getting defined in the stack
        rol = new int[5]; // initialisation: actualy here object is being created in the heap memory
        System.out.println(rol[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}
