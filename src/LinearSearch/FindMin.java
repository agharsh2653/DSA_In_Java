package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 45, 5, 13,21};
        System.out.println(min(arr));
        System.out.println(max(arr));

    }
    //assume arr[i]!=0;
    static int min(int[] arr){
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    static int max(int[] arr){
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
