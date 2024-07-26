package Sorting;

public class MissingPositive {
    public static void main(String[] args) {
        int[] arr = {5, 3, 0, 1, 2};
        int ans = findMissingPositive(arr);
        System.out.println(ans);
    }

    public static int findMissingPositive(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i] > 0 && arr[i] <=arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        //search for first missing letter
        for(int index =0; index<arr.length; index++){
            if(arr[index] != index){
                return index+1;
            }
        }
        //case 2
        return arr.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
