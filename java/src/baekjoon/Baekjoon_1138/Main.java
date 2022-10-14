package baekjoon.Baekjoon_1138;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= n; i++) {
			int count = Integer.parseInt(st.nextToken());
			for (int j = 0; j < n; j++) {
				if (count == 0 && arr[j] == 0) {
					arr[j] = i;
					break;
				} else if (arr[j] == 0) {
					count -= 1;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
