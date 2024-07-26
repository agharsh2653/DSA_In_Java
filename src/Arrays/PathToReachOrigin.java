package Arrays;

public class PathToReachOrigin {
    public static void main(String[] args) {
        System.out.println(ways(2,8));
    }
    public static int ways(int n, int m)
    {
        int MOD = 1000000007;
        if(n==0 || m==0){
            return 1;
        }
        return nCr(n+m,Math.min(n, m))%MOD;
    }
    static int nCr(int n, int r)
    {
        int MOD = 1000000007;

        // Create a 2D array to store intermediate results
        int[][] dp = new int[n + 1][r + 1];

        // Initialize base cases
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, r); j++) {
                if (j == 0 || j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % MOD;
                }
            }
        }

        return dp[n][r];
    }
}
