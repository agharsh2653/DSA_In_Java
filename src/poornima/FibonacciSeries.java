package poornima;
import java.util.Arrays;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int mod = 1000000007;
        int[] sum = new int[n+1];
        sum[0] = 0;
        sum[1] = 1;

        for(int i=2; i<=n; i++){
            sum[i] = (sum[i-1]+sum[i-2]) %mod;
        }
        System.out.println(Arrays.toString(sum));;
    }
}
