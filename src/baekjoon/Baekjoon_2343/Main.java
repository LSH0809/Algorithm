package baekjoon.Baekjoon_2343;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int n, m;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n];

		st = new StringTokenizer(br.readLine(), " ");
		int maxValue = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			maxValue = Math.max(maxValue,arr[i]);
		}
		System.out.println(solve(maxValue,Integer.MAX_VALUE));
	}

	public static long solve(long start, long end) {
		while (start <= end) {
			long sum = 0;
			long mid = (start + end) / 2;
			int count = 1;

			for (int i = 0; i < n; i++) {
				sum += arr[i];
				if (sum > mid) {
					sum = arr[i];
					count += 1;
				}
			}
			if (count <= m) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return start;
	}
}
