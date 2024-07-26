package Math;

public class grayToBinary {
    public static void main(String[] args) {

    }
    public static int grayToBinary(int n) {

        String gray = Integer.toBinaryString(n);
        String binary = grayToBinary(gray);
        int ans = binaryToInteger(binary);
        return ans;

    }

    static int binaryToInteger(String binary) {
        char[] numbers = binary.toCharArray();
        int result = 0;
        for(int i=numbers.length - 1; i>=0; i--)
            if(numbers[i]=='1')
                result += Math.pow(2, (numbers.length-i - 1));
        return result;
    }
    public static String grayToBinary(String gray) {
        int n = gray.length();
        String binary = "";

        // The most significant bit of binary code is same as the Gray code
        binary += gray.charAt(0);

        // Compute remaining bits
        for (int i = 1; i < n; i++) {
            // If current bit is 0, XOR with previous bit
            if (gray.charAt(i) == '0' && binary.charAt(i - 1) == '1') {
                binary += '1';
            }
            // If current bit is 1, XOR with previous bit
            else if (gray.charAt(i) == '1' && binary.charAt(i - 1) == '0') {
                binary += '1';
            }
            // Otherwise, append previous bit
            else {
                binary += '0';
            }
        }

        return binary;
    }
}
