package Math;
import java.util.ArrayList;
public class Factors {
    public static void main(String[] args) {
        int n =256;
        factor1(n);
        System.out.println();
        factor2(n);
        System.out.println();
        factor3(n);
    }
    //0(n)
    static void factor1(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }

    // both time and space with be O(sqrt(n))
    static void factor2(int n){
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                if(n/i==i) {
                    System.out.print(i + " ");
                }else{
                    System.out.print(i+" "+n/i+" ");
                }
            }

        }
    }

    static void factor3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i == i) {
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
