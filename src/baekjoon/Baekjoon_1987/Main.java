package baekjoon.Baekjoon_1987;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int r, c;
	static int[][] arr;
	static boolean[] visited;
	static int[] dx = {0, -1, 0, 1};
	static int[] dy = {1, 0, -1, 0};
	static int answer = Integer.MIN_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		arr = new int[r][c];
		visited = new boolean[26];

		for (int i = 0; i < r; i++) {
			String str = br.readLine();
			for (int j = 0; j < c; j++) {
				arr[i][j] = str.charAt(j) - 'A';
			}
		}
		solve(0, 0, 0);
		System.out.println(answer);

	}

	public static void solve(int x, int y, int count) {
		if (visited[arr[x][y]]) {
			answer = Math.max(answer, count);
			return;
		}

		visited[arr[x][y]] = true;

		for (int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];

			if (nextX >= 0 && nextY >= 0 && nextX < r && nextY < c) {
				solve(nextX, nextY, count + 1);
			}
		}
		visited[arr[x][y]] = false;
	}
}
