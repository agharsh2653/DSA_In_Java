package Recursion;

public class fibo {
    public static void main(String[] args) {
        int ans = fibonacci(9);
        System.out.println(ans);
    }

    static int fibonacci(int num){
        //base condition
        if(num<2){
            return num;
        }
        return fibonacci(num-1)+ fibonacci(num-2);
    }
}
