package baekjoon.Baekjoon_15657;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int n,m;
	static int[] arr,answer;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");
		arr = new int[n];
		answer = new int[m];
		visited = new boolean[n];
		
		for(int i = 0; i< n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		solve(0);
	}
	
	public static void solve(int idx){
		if(idx == m){
			for(int i = 0; i< m; i++){
				System.out.print(answer[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i< n; i++){
			if(idx == 0){
				answer[idx] = arr[i];
				solve(idx + 1);
			}
			else if(answer[idx - 1] <= arr[i] ){
				answer[idx] = arr[i];
				solve(idx + 1);
			}
		}
	}
}
