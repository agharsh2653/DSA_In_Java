package Math;

public class ReverseBit {
    public static void main(String[] args) {
        System.out.println(reverseBits(11));
    }
    static long reverseBits(long x){
        long num = 0;
        for(int i=0; i<Integer.SIZE; i++){
            num = num<<1;
            if((x&1)>0){
                num = num^1;
            }
            x = x>>1;
        }
        return num;
    }
}
