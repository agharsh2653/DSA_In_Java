package assignment;
import java.util.Scanner;
public class New {
    private static final String ALPHABET = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < T; i++) {
            int numberToConvert = scanner.nextInt(); // Input number for this test case
            String base58Result = encodeBase58(numberToConvert);
            System.out.println(numberToConvert + " into " + base58Result);
        }

        scanner.close();
    }

    public static String encodeBase58(int n) {
        StringBuilder base58 = new StringBuilder();

        while (n > 0) {
            int remainder = n % 58;
            base58.insert(0, ALPHABET.charAt(remainder));
            n /= 58;
        }

        return base58.toString();
    }
}





