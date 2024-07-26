package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 3, 4 , 15, 16, 18, 22, 45, 49};
        int target = 22;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            //find the middle element
           // int mid = (start +end ) / 2;  might be possible that (start - end) /2  exceeds the range of int java
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                //ans find
                return mid;
            }
        }
        return -1;
    }
}
