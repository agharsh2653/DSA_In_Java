package String;
import java.util.*;

//345. Reverse Vowels of a String
//https://leetcode.com/problems/reverse-vowels-of-a-string/submissions/1317861665/?envType=study-plan-v2&envId=leetcode-75
public class reverseVowels {
    public static String reverseVowels(String s) {
        // Convert the string to a character array
        char[] chars = s.toCharArray();

        // Set to hold vowels in both lowercase and uppercase
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        // Stack to store vowels found in the string
        Stack<Character> stack = new Stack<>();

        // Traverse the string to push vowels onto the stack
        for (char c : chars) {
            if (vowels.contains(c)) {
                stack.push(c);
            }
        }

        // Replace vowels in the original string with vowels from the stack
        for (int i = 0; i < chars.length; i++) {
            if (vowels.contains(chars[i])) {
                chars[i] = stack.pop();
            }
        }

        // Convert the character array back to string
        return new String(chars);
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "leetcode";

        System.out.println(reverseVowels(s1)); // Output: "holle"
        System.out.println(reverseVowels(s2)); // Output: "leotcede"
    }
}
