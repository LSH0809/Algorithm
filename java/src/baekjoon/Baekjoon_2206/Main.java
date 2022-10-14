package baekjoon.Baekjoon_2206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n,m,result;
	static int[][] arr,visited;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n + 1][m + 1];
		visited = new int[n + 1][m + 1];
		
		for(int i = 1; i< n + 1; i++){
			String str = br.readLine();
			for(int j = 1; j< m + 1; j++){
				int value = Integer.parseInt(String.valueOf(str.charAt(j-1)));
				arr[i][j] = value;
				visited[i][j] = Integer.MAX_VALUE;
			}
		}
		result = getRoute(1,1);
		System.out.println(result);
	}
	
	private static int getRoute(int x, int y){
		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(x, y,1,0));
		visited[x][y] = 0;
		
		while(!queue.isEmpty()){
			Point point = queue.poll();
			
			if(point.x == n && point.y == m){
				return point.count;
			}
			
			for(int i = 0; i< 4; i++) {
				int nowX = point.x + dx[i];
				int nowY = point.y + dy[i];
				
				if(nowX > 0 && nowY > 0 && nowX < n + 1 && nowY < m + 1){
					if(visited[nowX][nowY] > point.drill){
						if(arr[nowX][nowY] == 0){
							queue.offer(new Point(nowX,nowY,point.count + 1,point.drill));
							visited[nowX][nowY] = point.drill;
						}else{
							if(point.drill == 0){
								queue.offer(new Point(nowX,nowY,point.count + 1,point.drill + 1));
								visited[nowX][nowY] = point.drill + 1;
							}
						}
					}
				}
			}
		}
		return -1;
	}
	
	static class Point{
		int x, y,count, drill;
		
		public Point(int x, int y, int count, int drill) {
			this.x = x;
			this.y = y;
			this.count = count;
			this.drill = drill;
		}
	}
}
