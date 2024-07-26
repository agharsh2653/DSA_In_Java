package Math;

public class Sieve {
    public static void main(String[] args) {
        int n=12;
        boolean[] primes = new boolean[n+1];
        System.out.println(primes[0]);
        sieve(primes, n);
    }
    static void sieve(boolean[] primes, int n){
        for(int i=2; i*i <=n; i++){
            if(!primes[i]){
                for(int j=i*2; j<=n; j+=i){
                    primes[j] = true;
                }
            }
        }
        for(int i=2; i<=n; i++){
            if(!primes[i]){
                System.out.println(i+" ");
            }
        }
    }
}
