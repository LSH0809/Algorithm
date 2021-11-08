package baekjoon.Baekjoon_7562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static class Point {

		int x;
		int y;
		int count;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public Point(int x, int y, int count) {
			this.x = x;
			this.y = y;
			this.count = count;
		}
	}

	static int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
	static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());

		while (testCase-- > 0) {
			int l = Integer.parseInt(br.readLine());
			Point[] points = new Point[2];

			for (int i = 0; i < 2; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				points[i] = new Point(start, end);
			}
			System.out.println(bfs(points, l));
		}
	}

	public static int bfs(Point[] points, int n) {
		Queue<Point> queue = new LinkedList<>();
		queue.offer(points[0]);

		boolean[][] visited = new boolean[n][n];
		visited[points[0].x][points[0].y] = true;

		while (!queue.isEmpty()) {
			Point point = queue.poll();

			if (point.x == points[1].x && point.y == points[1].y) {
				return point.count;
			}

			for (int i = 0; i < 8; i++) {
				int nextX = point.x + dx[i];
				int nextY = point.y + dy[i];

				if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= n) {
					continue;
				}
				if (!visited[nextX][nextY]) {
					visited[nextX][nextY] = true;
					queue.offer(new Point(nextX, nextY, point.count + 1));
				}
			}
		}
		return 0;
	}
}
