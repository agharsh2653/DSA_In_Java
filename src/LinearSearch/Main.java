package LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1 , 2, 8, 19, -3, 16, -11};
        int target = 19;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    //search in thr array: return thr index if item found
    //otherwise if item not found return -1;
    static int linearSearch(int[]  arr, int target){
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
