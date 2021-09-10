package baekjoon.Baekjoon_17413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();
        boolean flag = false; // <> 안에 있는지 표시

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '<') {
                flag = true;
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(input.charAt(i));
            } else if (input.charAt(i) == '>') {
                flag = false;
                System.out.print(input.charAt(i));
            } else if (flag) {
                System.out.print(input.charAt(i));
            } else {
                if (input.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop());
                    }
                    System.out.print(" ");
                } else
                    stack.push(input.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
