package Pattern;

public class Pattern1 {
    public static void main(String[] args) {
        int num = 5;
//        pattern1(num);
//        pattern2(num);
//        pattern3(num);
//        pattern4(num);
//        pattern27(num);
//        pattern29(num);
//        pattern16(num);
//        pattern5(num);
//        pattern6(num);
        pattern7(num);
        pattern8(num);
        pattern9(num);
        pattern10(num);
    }

    static void pattern1(int num){
        for(int i=1; i<=num; i++){
            //for every row , col is printed
            for(int j=1; j<=i; j++){
                System.out.print("$ ");
            }
            //when one line is printed , we need to add new line
            System.out.println();
        }
    }

    static void pattern2(int num){
        for(int i=0; i<num; i++){
            //for every row , col is printed
            for(int j=0; j<num-i; j++){
                System.out.print("$ ");
            }
            //when one line is printed , we need to add new line
            System.out.println();
        }
    }

    static void pattern3(int num){
        for(int i=1; i<=num; i++){
            //for every row , col is printed
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            //when one line is printed , we need to add new line
            System.out.println();
        }
    }

    static void pattern4(int num){
        for(int i=0; i<num*2; i++){
            //for every row , col is printed
            int totalcol = i>num ? 2*num-i : i;
            for(int j=1; j<=totalcol; j++){
                System.out.print("$ ");
            }
            //when one line is printed , we need to add new line
            System.out.println();
        }
    }

    static void pattern27(int num){
        for(int i=0; i<num*2; i++){
            int totalcol = i>num ? 2*num-i : i;
            int noOfSpaces = num- totalcol;
            for(int s =0; s<noOfSpaces; s++){
                System.out.print(" ");
            }
            for(int j=1; j<=totalcol; j++){
                System.out.print(j+" ");
            }
            //when one line is printed , we need to add new line
            System.out.println();
        }
    }

    static void pattern29(int num){
        for (int row=1; row<=num; row++){
            for(int space=0; space<num-row; space++){
                System.out.print("  ");
            }
            for(int col=row; col>=1; col--){
                System.out.print(col+" ");
            }
            for(int col=2; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern16(int num){
        for (int row=1; row<=2*num; row++){
            int c= row>num? 2*num-row : row;
            for(int space=0; space<num-c; space++){
                System.out.print("  ");
            }
            for(int col=c; col>=1; col--){
                System.out.print(col+" ");
            }
            for(int col=2; col<=c; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int num){
        for(int i=1; i<=num; i++){
            for(int space=1; space<=num-i; space++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int num){
        for(int i=1; i<=num; i++){
            for(int space=1; space<i; space++){
                System.out.print("  ");
            }
            for(int j=0; j<=num-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int num){
        for(int i=0; i<num; i++){
            for(int space=1; space<num-i; space++){
                System.out.print("  ");
            }
            for(int j=0; j<2*i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int num){
        for(int i=num-1; i>=0; i--){
            for(int space=1; space<num-i; space++){
                System.out.print("  ");
            }
            for(int j=2*i+1; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int num){
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

    static void pattern10(int num){
        for(int i=num-1; i>=0; i--){
            for(int space=1; space<num-i; space++){
                System.out.print(" ");
            }
            for(int j=i+1; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
