package BufferedReaderClass;
import java.io.*;
public class add {
    public static void main(String[] args)throws IOException
    {
       int a, b,c;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of a");
        a = Integer.parseInt(br.readLine());
        System.out.println("Enter the value of b");
        b = Integer.parseInt(br.readLine()); //Float.parseFloat(br.readLine());
        c = a+b;
        System.out.println("Sum of two number is"+c);
    }
}