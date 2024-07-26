package Sorting;
import java.util.ArrayList;
import java.util.Arrays;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,4};
        ArrayList<Integer> ans = new ArrayList<>();
                ans = findDuplicates(arr);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
    }

    public static ArrayList<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while(i<arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index+1){

            }else{
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
