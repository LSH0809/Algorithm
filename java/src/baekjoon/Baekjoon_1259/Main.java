package baekjoon.Baekjoon_1259;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			char[] str = br.readLine().toCharArray();
			boolean flag = true;
			if (str[0] == '0') {
				break;
			}
			char[] reverse = new char[str.length];
			for (int i = 0; i < str.length; i++) {
				reverse[i] = str[str.length - i - 1];
			}

			for (int i = 0; i < str.length; i++) {
				if (str[i] != reverse[i]) {
					flag = false;
				}
			}

			if (flag) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
