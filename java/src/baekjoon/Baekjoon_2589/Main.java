package baekjoon.Baekjoon_2589;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import javax.swing.text.View;

public class Main {
	static int height,width;
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	static char arr[][];
	static boolean visited[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		height = Integer.parseInt(st.nextToken());
		width = Integer.parseInt(st.nextToken());
		arr = new char[height][width];
		visited = new boolean[height][width];
		int answer = 0;

		for (int i = 0; i < height; i++) {
			String str = br.readLine();
			for (int j = 0; j < width; j++) {
				arr[j][i] = str.charAt(j);
			}
		}

		for(int i =0; i< height; i++){
			for(int j = 0; j< width; j++){
				if(arr[j][i] == 'L'){
					visited = new boolean[height][width];
					int value = solve(new Point(j,i,0));
					answer = Math.max(value, answer);
				}
			}
		}
		System.out.println(answer);
	}

	public static int solve(Point point){
		Queue<Point> queue = new LinkedList<>();
		queue.offer(point);
		visited[point.y][point.x] = true;
		int value = 0;
		while(!queue.isEmpty()){
			Point poll = queue.poll();
			for(int d = 0; d < 4; d++){
				int nextX = poll.x + dx[d];
				int nextY = poll.y + dy[d];

				if(nextX > 0 && nextY > 0 && nextX < width && nextY < height){
					if(!visited[nextY][nextX] && arr[nextY][nextX] == 'L'){
						visited[nextY][nextX] = true;
						queue.offer(new Point(nextY,nextX, poll.count + 1));
						value = Math.max(value, poll.count + 1);
					}
				}
			}
		}
		return value;
	}
	public static class Point{
		int x;
		int y;
		int count;

		public Point(int x, int y, int count) {
			this.x = x;
			this.y = y;
			this.count = count;
		}
	}
}

// https://machine-geon.tistory.com/152
