package baekjoon.Baekjoon_9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        Stack<Character> stack = new Stack<>();

        while (T-- > 0) {
            boolean check = true;
            stack.clear();
            String input = bf.readLine();
            for (int i = 0; i < input.length(); i++) {
                char temp = input.charAt(i);

                if (temp == '(') {
                    stack.push('(');
                } else if (temp == ')') {
                    if (stack.isEmpty()) {
                        check = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (!stack.isEmpty()) {
                check = false;
            }

            if (check == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
