package baekjoon.Baekjoon_15666;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
	static int n,m;
	static int[] arr,result;
	static boolean[] visited;
	static LinkedHashSet<String> answer;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		result = new int[m];
		visited = new boolean[n];
		answer = new LinkedHashSet<>();
		
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i< n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		solve(0,0);
		
		answer.forEach(System.out::println);
	}
	
	private static void solve(int start, int idx){
		if(idx == m){
			StringBuilder sb = new StringBuilder();
			for(int i =0 ; i< m; i++){
				sb.append(result[i]).append(" ");
			}
			answer.add(sb.toString());
			return;
		}
		for(int i = start; i< n; i++){
			result[idx] = arr[i];
			solve(i,idx + 1);
		}
	}
}
