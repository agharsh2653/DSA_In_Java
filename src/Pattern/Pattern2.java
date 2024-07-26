package Pattern;

public class Pattern2 {
    public static void main(String[] args) {
        int num =5;
        pattern11(num);
        pattern12(num);
        pattern30(num);
    }

    static void pattern12(int num){
        for(int i=0; i<num; i++){
            for(int space=1; space<num-i; space++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                if(j==0 || j==num-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern30(int num){
        int original = num;
        num = num*2;
        for(int i=0; i<=num; i++){
            for(int j=0; j<=num; j++){
                int atEveryIndex = original-Math.min(Math.min(i,j), Math.min(num-i, num-j));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

    static void pattern11(int num){
        for(int i=num-1; i>=0; i--){
            for(int space=1; space<num-i; space++){
                System.out.print(" ");
            }
            for(int j=i+1; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0; i<num; i++){
            for(int space=1; space<num-i; space++){
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
