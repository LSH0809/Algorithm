package baekjoon.Baekjoon_1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int testCase;
	static int m, n, k;
	static int[][] arr;
	static boolean[][] visited;
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
		testCase = Integer.parseInt(br.readLine());
		while (testCase-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			arr = new int[m][n];
			visited = new boolean[m][n];
			int count = 0;
			for (int i = 0; i < k; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				arr[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
			}

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (!visited[i][j] && arr[i][j] == 1) {
						solve(i, j);
						count += 1;
					}
				}
			}
			System.out.println(count);
		}
	}

	public static void solve(int x, int y) {
		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(x, y));
		visited[x][y] = true;
		while (!queue.isEmpty()) {
			Point poll = queue.poll();

			for (int i = 0; i < 4; i++) {
				int nextX = poll.x + dx[i];
				int nextY = poll.y + dy[i];

				if (nextX < 0 || nextY < 0 || nextX >= m || nextY >= n) {
					continue;
				}

				if (!visited[nextX][nextY] && arr[nextX][nextY] == 1) {
					visited[nextX][nextY] = true;
					queue.offer(new Point(nextX, nextY));
				}
			}
		}
	}
}
