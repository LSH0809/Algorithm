package baekjoon.Baekjoon_18111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 최소값 ~ 최대값의 범위 가능
		// for문으로 해당 수까지 계산하면서 계산
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int[][] arr = new int[n][m];
		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;
		int answerSecond = Integer.MAX_VALUE;
		int answerHeight = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < m; j++) {
				int number = Integer.parseInt(st.nextToken());
				minValue = Math.min(minValue, number);
				maxValue = Math.max(maxValue, number);
				arr[i][j] = number;
			}
		}

		for (int k = minValue; k < maxValue + 1; k++) {
			int second = 0;
			int inventory = b;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (k >= arr[i][j]) {
						second += (k - arr[i][j]);
						inventory -= (k - arr[i][j]);
					} else {
						second += 2 * (arr[i][j] - k);
						inventory += (arr[i][j] - k);
					}
				}
			}

			if (inventory >= 0) {
				if (second <= answerSecond) {
					answerSecond = second;
					answerHeight = k;
				}
			}

		}
		System.out.println(answerSecond + " " + answerHeight);
	}
}
