package baekjoon.Baekjoon_5212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static int r,c;
	static char[][] arr;
	static boolean[][] visited;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		arr = new char[r][c];
		visited = new boolean[r][c];
		
		for(int i = 0; i< r; i++){
			String str = br.readLine();
			for(int j = 0; j< c; j++){
				arr[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i< r; i++){
			for(int j = 0; j< c; j++){
				if(arr[i][j] == '.'){
					solve(i,j);
				}
			}
		}
	}
	
	private static void solve(int x, int y){
		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(x, y));
		while(!queue.isEmpty()){
			Point point = queue.poll();
			for(int i = 0; i< 4; i++){
				int nowX = point.x + dx[i];
				int nowY = point.y + dy[i];
				
				if(nowX >= 0 && nowY >= 0 && nowX < r && nowY < c){
					if(!visited[nowX][nowY] && arr[nowX][nowY] == 'X'){
						visited[nowX][nowY] = true;
						arr[nowX][nowY] = '.';
						queue.offer(new Point(nowX,nowY));
					}
				}
			}
		}
	}
	
	private static int[][] check(){
		int[][] answer = new int[r][c];
		
		return answer;
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
