package LinearSearch;
import java.util.Scanner;
public class RichestpersonWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] accounts = new int[3][3] ;
        for(int row =0; row<accounts.length; row++){
            for(int col = 0; col<accounts[row].length; col++){
                accounts[row][col] = in.nextInt();
                //System.out.print(arr[row][col]+" ");
            }
            //System.out.println();
        }
         int num = maximumWealth(accounts);
        System.out.println(num);
    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int row=0; row<accounts.length; row++){
            int sum =0;
            for(int col=0; col<accounts[row].length; col++){
                sum += accounts[row][col];
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
