package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
       int[] arr = {89, 23, 42, 9, 20};
       //int[] arr = {1, 5, 2, 4, 3};
        bubble(arr);
       System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        //run the steps n-1 times
        int count = 0;
        boolean swapped;
        for(int i=0; i<arr.length; i++){
            swapped = false;
            //for each step, max item will come at last respected index
            for(int j = 1; j<arr.length; j++){
               //swap if item is smaller then the previous item
                if(arr[j] < arr[j-1]){
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                   swapped = true;
                }
                count++;
            }
            //if you did not swap for a particular value of i it means the arr is sorted hence stop the program
            if(!swapped){ //!false = true
                break;
            }
            System.out.println(count);
        }

    }
}
