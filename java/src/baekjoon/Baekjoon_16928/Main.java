package baekjoon.Baekjoon_16928;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n,m,result;
	static boolean[] visited = new boolean[101];
	static int[] map = new int[101];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		result = 0;
		Arrays.fill(map,0);
		
		for(int i = 0; i< n + m ; i++){
			st = new StringTokenizer(br.readLine()," ");
			map[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
		}
		solve();
	}
	
	public static void solve(){
		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(1,0));
		visited[1] = true;
		
		while(!queue.isEmpty()){
			Point poll = queue.poll();
			if(poll.position == 100){
				System.out.println(poll.count);
				return;
			}else{
				for(int i = 1; i<= 6; i++){
					if(poll.position + i <= 100){
						if(!visited[poll.position + i] && map[poll.position + i] == 0){
							queue.offer(new Point(poll.position + i, poll.count + 1));
							visited[poll.position + i] = true;
						}else if(!visited[poll.position + i] && map[poll.position + i] != 0){
							queue.offer(new Point(map[poll.position + i], poll.count + 1));
							visited[map[poll.position + i]] = true;
						}
					}
				}
			}
		}
	}
	
	static class Point{
		int position;
		int count;
		
		public Point(int position, int count) {
			this.position = position;
			this.count = count;
		}
	}
}
