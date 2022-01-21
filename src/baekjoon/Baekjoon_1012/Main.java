package baekjoon.Baekjoon_1012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	static int t,m,n,k;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		
		while(t-- > 0){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			int count = 0;
			
			arr = new int[n][m];
			visited = new boolean[n][m];
			
			for(int i = 0; i< k; i++){
				st = new StringTokenizer(br.readLine()," ");
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				arr[y][x] = 1;
			}
			
			for(int i = 0; i< n; i++){
				for(int j = 0; j< m; j++){
					if(arr[i][j] == 1 && !visited[i][j]){
						count += 1;
						solve(i,j);
					}
				}
			}
			System.out.println(count);
		}
	}
	
	private static void solve(int x, int y){
		Stack<Point> stack = new Stack<>();
		stack.push(new Point(x,y));
		
		while(!stack.isEmpty()){
			Point point = stack.pop();
			for(int i = 0; i< 4; i++){
				int nextX = point.x + dx[i];
				int nextY = point.y + dy[i];
				
				if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < m){
					if(arr[nextX][nextY] == 1 && !visited[nextX][nextY]) {
						visited[nextX][nextY] = true;
						stack.push(new Point(nextX,nextY));
					}
				}
			}
		}
	}
	
	static class Point{
		int x, y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
