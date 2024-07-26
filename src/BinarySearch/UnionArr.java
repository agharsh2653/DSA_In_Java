package BinarySearch;

import java.util.ArrayList;
import java.util.*;

public class UnionArr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,6};
        int[] arr2 = {1,2,3,5,7};
        ArrayList<Integer> list = findUnion(arr1,arr2,arr1.length,arr2.length);
    }
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int[] u = new int[n+m];

        // using the pre-defined function arraycopy
        System.arraycopy(arr1, 0, u, 0, n);
        System.arraycopy(arr2, 0, u, n, m);
        Arrays.sort(u);
        int u1 = removeDuplicates(u);
        for(int i=0; i<u1; i++){
            list.add(u[i]);
        }

        return list;
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int idx = 0; // It store indexing of unique elements.

        while (idx != n) {
            int i = binarySearch(nums, idx + 1, n - 1, nums[idx]); // It finds upper bound of element.

            if (i == n)
                return idx + 1; // Means that we are not able to find the upper bound of the element.
            idx++;
            nums[idx] = nums[i];
        }
        return idx + 1;
    }
    public static int binarySearch(int[] nums, int low, int high, int val) {
        int n = nums.length;
        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            // Check for lower limit
            if (nums[mid] <= val)
                low = mid + 1;
                // Check for higher limit
            else {
                // Move to higher limit
                res = mid;
                high = mid - 1;
            }
        }
        // Check if not found
        if (res == -1)
            return n;

        return res;
    }
}
