package String;

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        String s= "a good   example";

        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();
        System.out.println(s);
        // Split by multiple spaces
        String[] words = s.split("\\s+");
        System.out.println(Arrays.toString(words));
        // Reverse array of words
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");

        }

        // Convert StringBuilder to String and trim trailing space
        return result.toString().trim();
    }
}
