package baekjoon.Baekjoon_7576;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int m, n;
	static int[][] arr;
	static Queue<Point> queue = new LinkedList<>();
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, -1, 0, 1};

	static class Point {

		int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());

		arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 1) {
					queue.offer(new Point(i, j));
				}
			}
		}
		System.out.println(solve());
	}

	public static int solve() {
		int result = Integer.MIN_VALUE;
		if (check()) {
			return 0;
		}
		while (!queue.isEmpty()) {
			Point poll = queue.poll();
			for (int i = 0; i < 4; i++) {
				int nextX = poll.x + dx[i];
				int nextY = poll.y + dy[i];

				if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < m) {
					if (arr[nextX][nextY] == 0) {
						queue.offer(new Point(nextX, nextY));
						arr[nextX][nextY] = arr[poll.x][poll.y] + 1;
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 0) {
					return -1;
				}
				result = Math.max(result, arr[i][j]);
			}
		}
		return result - 1;
	}

	public static boolean check() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] != 1) {
					return false;
				}
			}
		}
		return true;
	}
}
