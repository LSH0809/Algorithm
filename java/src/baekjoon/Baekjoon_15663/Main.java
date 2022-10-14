package baekjoon.Baekjoon_15663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
	static int n,m;
	static int[] arr,permutation;
	static boolean[] visited;
	static LinkedHashSet<String> answer;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n];
		permutation = new int[m];
		visited = new boolean[n];
		answer = new LinkedHashSet<>();
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i< n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		solve(0);
		
		answer.forEach(System.out::println);
	}
	
	public static void solve(int idx){
		if(idx == m){
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < m; i++){
				sb.append(permutation[i]).append(" ");
			}
			answer.add(sb.toString());
			return;
		}
		
		for(int i = 0; i< n; i++){
				if(!visited[i]) {
					visited[i] = true;
					permutation[idx] = arr[i];
					solve(idx + 1);
					visited[i] = false;
				}
		}
	}
}
