package Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {5, 3, 0, 1, 2};
        int ans = Cycle(arr);
        System.out.println(ans);
    }

    static int Cycle(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i] <arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        //search for first missing letter
        for(int index =0; index<arr.length; index++){
            if(arr[index] != index){
                return index;
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
