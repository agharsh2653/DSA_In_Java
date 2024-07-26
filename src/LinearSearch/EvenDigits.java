package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 3, 1, 7895,241};
        System.out.println(findNumbers(nums));
     //   System.out.println(digit(nums :6789));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberDigits = digit(num);
        if(numberDigits%2==0){
            return true;
        }
        return false;
    }

    static int digit(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
