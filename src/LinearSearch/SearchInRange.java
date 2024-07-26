package LinearSearch;
import java.util.Scanner;
public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int[] arr = {18, 12, -7, 3,14, 28};
        System.out.println("Enter the number which have you wants to find in this array :");
      int target = in.nextInt();
        System.out.println(linearSearch(arr, target,1,4));
    }
    static int linearSearch(int[]  arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length; index++){
            //check for a element at every index
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        // this line will executes if none of the return statements above have executes
        //hence the target not found
        return -1;
    }
}
