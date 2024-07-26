package Math;

public class SetBits {
    public static void main(String[] args) {
        int n =3;
        String an = Integer.toBinaryString(n);
        System.out.println(Setbits(n));
    }
    private static int Setbits(int n){
        int count =0;
        while(n>0){
            count++;
            //n -= (n& -n);
            n= n&(n-1);
        }
        return count;
    }
}
