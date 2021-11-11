package baekjoon.Baekjoon_2138;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static char[] arr, goal;
	static int n;
	static int answer = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = br
			.readLine()
			.toCharArray();
		goal = br
			.readLine()
			.toCharArray();
		solve(1, 0);
		arr[0] ^= 1;
		arr[1] ^= 1;
		solve(1, 1);
		if (answer == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(answer);
		}
	}

	public static void solve(int idx, int count) {
		if (idx == arr.length - 1) {
			if (arr[idx] == goal[idx] && arr[idx - 1] == goal[idx - 1]) {
				answer = Math.min(answer, count);
				return;
			} else if ((arr[idx] ^ 1) == goal[idx] && (arr[idx - 1] ^ 1) == goal[idx - 1]) {
				answer = Math.min(answer, count + 1);
				return;
			}
			return;
		}
		if (arr[idx - 1] == goal[idx - 1]) {
			solve(idx + 1, count);
		} else {
			arr[idx] ^= 1;
			arr[idx - 1] ^= 1;
			arr[idx + 1] ^= 1;
			solve(idx + 1, count + 1);
			arr[idx] ^= 1;
			arr[idx - 1] ^= 1;
			arr[idx + 1] ^= 1;
		}
	}
}
