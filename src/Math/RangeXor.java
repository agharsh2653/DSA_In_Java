package Math;

public class RangeXor {
    public static void main(String[] args) {
        // Range XOR for a ,b = XOR(b) ^ XOR(a-1)
        int a= 22;
        int b= 234;
        int ans  = XOR(b) ^ XOR(a-1);
        System.out.println(ans);

        //it only for check, will give Time Limit Exceeds(TLE) for larger number
        int ans2 = 0;
        for(int i=a; i<=b; i++){
            ans2 ^=i;
        }
        System.out.println(ans2);
    }

    private static int XOR(int a){
        if(a % 4 == 0){
            return a;
        }
        if(a % 4 == 1){
            return 1;
        }
        if(a % 4 == 2){
            return a+1;
        }
        return 0;
    }
}
