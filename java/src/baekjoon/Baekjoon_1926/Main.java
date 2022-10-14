package baekjoon.Baekjoon_1926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n,m;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static int[][] arr;
	static boolean[][] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m];
		List<Integer> list = new ArrayList<>();
		
		for(int i =0; i< n; i++){
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0; j< m; j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i< n; i++){
			for(int j = 0; j< m; j++){
				if(arr[i][j] == 1 && !visited[i][j]){
					visited[i][j] = true;
					list.add(solve(i,j));
				}
			}
		}
		
		int maxValue = 0;
		for(Integer num : list){
			maxValue = Math.max(maxValue, num);
		}
		
		System.out.println(list.size());
		System.out.println(list.size() == 0 ? 0 : maxValue);
	}
	
	private static int solve(int x, int y){
		Queue<Point> queue = new LinkedList<>();
		int count = 0;
		queue.offer(new Point(x,y));
		while(!queue.isEmpty()){
			Point point = queue.poll();
			count += 1;
			for(int i = 0 ; i< 4; i++){
				int nextX = point.x + dx[i];
				int nextY = point.y + dy[i];
				
				if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < m){
					if(!visited[nextX][nextY] && arr[nextX][nextY] == 1){
						queue.offer(new Point(nextX,nextY));
						visited[nextX][nextY] = true;
					}
				}
			}
		}
		return count;
	}
	
	static class Point{
		int x;
		int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
