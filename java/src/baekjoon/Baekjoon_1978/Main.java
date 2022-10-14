package baekjoon.Baekjoon_1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		boolean[] arr = new boolean[1001];
		arr[0] = true;
		arr[1] = true;
		int count = 0;

		for (int i = 2; i < Math.sqrt(1000) + 1; i++) {
			for (int j = i * i; j < 1001; j += i) {
				arr[j] = true;
			}
		}

		for (int i = 0; i < n; i++) {
			int number = Integer.parseInt(st.nextToken());
			if (!arr[number]) {
				count += 1;
			}
		}
		System.out.println(count);
	}
}
