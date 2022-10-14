package baekjoon.Baekjoon_5397;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		while (testCase-- > 0) {
			StringBuffer sb = new StringBuffer();
			Stack<Character> pre = new Stack<>();
			Stack<Character> post = new Stack<>();
			char[] chars = br
				.readLine()
				.toCharArray();

			for (Character character : chars) {
				switch (character) {
					case '<':
						if (!pre.isEmpty()) {
							post.push(pre.pop());
						}
						break;
					case '>':
						if (!post.isEmpty()) {
							pre.push(post.pop());
						}
						break;
					case '-':
						if (!pre.isEmpty()) {
							pre.pop();
						}
						break;
					default:
						pre.push(character);
						break;
				}
			}
			while (!post.isEmpty()) {
				pre.push(post.pop());
			}

			for (int i = 0; i < pre.size(); i++) {
				sb.append(pre.elementAt(i));
			}
			System.out.println(sb);
		}
	}
}
