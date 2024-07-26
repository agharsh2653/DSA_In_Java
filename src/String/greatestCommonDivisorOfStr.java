package String;

//For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
//Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.  1071
//https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75
public class greatestCommonDivisorOfStr {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        // Compute gcd of len1 and len2
        int gcdLen = gcd(len1, len2);

        // Extract potential gcd string
        String gcdStr = str1.substring(0, gcdLen);

        // Verify if gcdStr is the divisor for both str1 and str2
        if (checkDivisor(str1, gcdStr) && checkDivisor(str2, gcdStr)) {
            return gcdStr;
        } else {
            return "";
        }
    }

    // Function to compute gcd of two numbers
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to check if str can be divided by divisor
    private boolean checkDivisor(String str, String divisor) {
        int strLen = str.length();
        int divLen = divisor.length();

        if (strLen % divLen != 0) {
            return false;
        }

        int repeats = strLen / divLen;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeats; i++) {
            sb.append(divisor);
        }

        return sb.toString().equals(str);
    }
}
