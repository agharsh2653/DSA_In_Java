package StackAndQueue;

import java.sql.SQLOutput;
import java.util.Stack;

//1190. Reverse Substrings Between Each Pair of Parentheses
//https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/description/?envType=daily-question&envId=2024-07-11
public class ReverseSubstringParenthesis {
    public static void main(String[] args) {
        String s = "(ed(et(oc))el)";
        System.out.println(reverseParentheses(s));
    }
    public static String reverseParentheses(String s) {
    Stack<Integer> stack = new Stack<>();
    char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
        if (chars[i] == '(') {
            stack.push(i);
        } else if (chars[i] == ')') {
            int start = stack.pop();
            reverse(chars, start + 1, i - 1); // reverse substring between start+1 and i-1
        }
    }

    StringBuilder sb = new StringBuilder();
        for (char c : chars) {
        if (c != '(' && c != ')') {
            sb.append(c);
        }
    }

        return sb.toString();
}

    private static void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}
