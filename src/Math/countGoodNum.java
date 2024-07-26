package Math;

public class countGoodNum {
    public static void main(String[] args) {
      int ans  = countGoodNumbers(50);
        System.out.println(ans);
    }
    public static int countGoodNumbers(long n) {
        long ans = 1;
        long mod = 1000000007;
        if (n == 0) {
            return 0;

        }
            long pow5 = powMod(5, n / 2, mod);
            long pow4 = powMod(4, n / 2, mod);
            if (n % 2 == 0) {
                ans = (pow5 * pow4) % mod;
            }
            else{
                ans = ((pow5 * pow4) * 5) % mod;
            }
            return (int) ans;
        }

        private static long powMod( long base, long exp, long mod){
            long result = 1;
            base = base % mod;
            while (exp > 0) {
                if( (exp&1) == 1) {
                    result = (result * base) % mod;
                }
                exp = exp >> 1;
                base = (base * base) % mod;
            }
            return result;
        }
    }

