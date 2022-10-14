package baekjoon.Baekjoon_10451;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int t,n,count;
	static int[] arr;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		
		while(t-- > 0){
			n = Integer.parseInt(br.readLine());
			arr = new int[n+1];
			visited = new boolean[n+1];
			count = 0;
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int i = 1; i< n + 1; i++){
				arr[i] = Integer.parseInt(st.nextToken());
			}
			for(int i = 1; i< n + 1; i++){
				if(!visited[arr[i]]) {
					solve(arr[i]);
					count += 1;
				}
			}
			System.out.println(count);
		}
	}
	
	private static void solve(int x){
		visited[x] = true;
		if(!visited[arr[x]]){
			solve(arr[x]);
		}
	}
}
