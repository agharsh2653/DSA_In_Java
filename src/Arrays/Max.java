package Arrays;

public class Max {
    public static void main(String[] args) {
//        int[] arr = {1, 24,6,78,21,9};
//        System.out.println(maxRange(arr,0,5));
        boolean a = true;
        boolean b = false;
        System.out.println(a||b);
    }

    static int maxRange(int[] arr, int start, int end){
        int maxVal = arr[start];
        for(int i= start; i<=end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
