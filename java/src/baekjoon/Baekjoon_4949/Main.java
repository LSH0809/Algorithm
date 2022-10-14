package baekjoon.Baekjoon_4949;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String str = br.readLine();
			if (str.equals(".")) {
				break;
			}
			System.out.println(solve(str));

		}
	}

	public static String solve(String str) {
		char[] arr = str.toCharArray();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			char now = arr[i];
			if (now == '(' || now == '[') {
				stack.push(now);
			} else if (now == ')') {
				if (stack.isEmpty() || stack.peek() != '(') {
					return "no";
				} else {
					stack.pop();
				}
			} else if (now == ']') {
				if (stack.isEmpty() || stack.peek() != '[') {
					return "no";
				} else {
					stack.pop();
				}
			}
		}

		if (stack.isEmpty()) {
			return "yes";
		} else {
			return "no";
		}
	}
}
