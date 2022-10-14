package programmers.level2.짝지어제거하기;

import java.util.Stack;

public class Solution {
    public static int solution(String s) {
        int answer = -1;

        Stack<Character> stack = new Stack<>();
        char[] s_arr = s.toCharArray();

        for (char c : s_arr) {
            if (stack.empty()) {
                stack.push(c);
            } else {
                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        if (stack.empty()) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}
