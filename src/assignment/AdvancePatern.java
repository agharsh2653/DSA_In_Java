package assignment;

public class AdvancePatern {
    public static void main(String[] args) {
        int num = 4;
        int n =5;

        //Diamond Pattern
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=i; j>=1; j--){
                System.out.print("* ");
                if(j!=1){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=i; j>=1; j--){
                System.out.print("* ");
                if(j!=1){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        //palindrom pattern
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);

            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }


        //number pyramid
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }




        //Baterfly pattern
        for (int i=1; i<=num; i++){
            //1st part
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //spaces
            int spaces = 2*(num-i);
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");

            }
            //2nd part
            for(int j=1; j<=i; j++){
                System.out.print("* ");

            }
            System.out.println();
        }


        for (int i=num; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("* ");
            }

            int spaces = 2*(num-i);
            for(int j=spaces; j>=1; j--){
                System.out.print("  ");

            }
            for(int j=i; j>=1; j--){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
