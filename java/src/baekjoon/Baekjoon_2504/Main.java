package baekjoon.Baekjoon_2504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		Stack<Character> stack = new Stack<>();

		for(int i =0 ; i< str.length; i++){
			if(str[i] == '(' || str[i] == '['){
				stack.push(str[i]);
			}
		}

	}
}
