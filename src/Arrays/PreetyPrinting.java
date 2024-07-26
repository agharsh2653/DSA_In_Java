package Arrays;

import java.util.ArrayList;

public class PreetyPrinting {
    public static void main(String[] args) {
        float a = 86.12852f;
        System.out.printf("Formatted number is %.3f"+"    ",a);
        System.out.println();
        System.out.printf("Pie = %.2f",Math.PI);
        System.out.println();
        System.out.printf("Hello my name is %s I am %s", "Harsh", "Cool");

        //Operators
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));

        System.out.println("a"+1);
        //this is same as after a few steps: "a" + 1;
        //Integer will be converted into integer that will call toString()
        System.out.println("Harsh"+ new ArrayList<>());
        System.out.println("Kunal"+ new Integer(23));
        String ans = new Integer(67) + "%d" + new ArrayList<>();
        System.out.println(ans);
        //+ operators only works on primitives data types


    }
}
