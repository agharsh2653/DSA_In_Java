package Math;

public class GCD_LCD {
    public static void main(String[] args) {
        System.out.println(gcd(3,12));
        System.out.println(lcd(2,11));
    }

    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    static int lcd(int a, int b){
        return a*b/gcd(a,b);
    }
}
