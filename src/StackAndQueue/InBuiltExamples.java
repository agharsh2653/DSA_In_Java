package StackAndQueue;

import java.util.*;

public class InBuiltExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(23);
        stack.push(30);
        stack.push(9);
        stack.push(13);
        stack.push(20);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Stack<Character> ch = new Stack<>();
        ch.push('t');
        String s = String.valueOf(ch.pop());
        System.out.println(s);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(1);
        queue.add(32);
        queue.add(21);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(78);
        deque.addLast(4);
        deque.remove();

    }
}
