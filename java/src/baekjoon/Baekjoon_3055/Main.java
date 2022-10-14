package baekjoon.Baekjoon_3055;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int r,c,count;
	static char[][] arr;
	static boolean[][] visited;
	static int[] arrive = new int[2];
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static Queue<Point> queue = new LinkedList<>();
	static Queue<Point> waterQueue = new LinkedList<>();

	static class Point{
		int y,x;

		public Point(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		arr = new char[r][c];
		visited = new boolean[r][c];
		count = 0;
		for(int i = 0; i< r; i++){
			char[] str = br.readLine().toCharArray();
			for(int j = 0; j< c; j++){
				arr[i][j] = str[j];

				if(str[j] == '*'){
					waterQueue.offer(new Point(i,j));
				}else if(str[j] == 'S'){
					queue.offer(new Point(i,j));
				}
			}
		}
		solve();
		System.out.println(count);
	}

	public static void solve(){

		while(true){
			count += 1;

			while(!waterQueue.isEmpty()){
				Point waterPoint = waterQueue.poll();

				for(int i = 0; i< 4; i++){
					int nextY = waterPoint.y + dy[i];
					int nextX = waterPoint.x + dx[i];

					if(nextY >=0 && nextX >= 0 && nextY < r && nextX < c){
						if(arr[nextY][nextX] == '.'){
							arr[nextY][nextX] = '*';
							waterQueue.offer(new Point(nextY,nextX));
						}
					}
				}
			}

			if(queue.size() == 0){
				System.out.println("KAKTUS");
				return;
			}

			while(!queue.isEmpty()){
				Point point = queue.poll();

				for(int i = 0; i< 4; i++){
					int nextY = point.y + dy[i];
					int nextX = point.x + dx[i];

					if(nextY >=0 && nextX>=0 && nextY < r && nextX < c){
						if(arr[nextY][nextX] == 'D'){
							return;
						}
						if(arr[nextY][nextX] == '.'){
							arr[nextY][nextX] = 'S';
							queue.offer(new Point(nextY,nextX));
						}
					}
				}
			}
		}
	}
}
