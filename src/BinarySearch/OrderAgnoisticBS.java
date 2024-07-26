package BinarySearch;

public class OrderAgnoisticBS {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 3, 4 , 15, 16, 18, 22, 45, 49};
        int target = 22;
        int ans = AgnoisticBS(arr, target);
        System.out.println(ans);
    }

    static int AgnoisticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        //find whether the array is sorted in ascending or descending

        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            //find the middle element
            // int mid = (start +end ) / 2;  might be possible that (start - end) /2  exceeds the range of int java
            int mid = start + (end - start)/2;


            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }
            }
           else{
                if(target > arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
