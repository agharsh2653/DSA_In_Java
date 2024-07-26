package BinarySearch;

public class firstLastPosition {
    public static void main(String[] args) {
       int[] nums = {5,7,7,8,8,10};
       int target = 8;
       // Create an instance of the class
        int[] ans = searchRange(nums, target); // Call the method on the instance
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        //check for first occurrence target if first
        int start = search(nums, target,true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;

    }

    //This function just return three index of what value  we are trying to search a target
    public static int search(int[] nums, int target, boolean findstartindex ){
        int ans = -1;
        int start = 0;

        int end = nums.length-1;
        while(start <= end) {
            //find the middle element
            // int mid = (start +end ) / 2;  might be possible that (start - end) /2  exceeds the range of int java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //Potential ans find
                ans =  mid;
                if(findstartindex) {
                    end = mid - 1;
                }
                else{
                    start = mid+1;
                }
            }

        }
        return ans;
    }
}
