package baekjoon.Baekjoon_11725;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static ArrayList<Integer>[] list;
	static int[] parents;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		list = new ArrayList[n+1];
		parents = new int[n+1];
		visited = new boolean[n+1];
		
		for(int i = 1; i< n+1; i++){
			list[i] = new ArrayList<>();
		}
		for(int i = 1; i< n; i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		
		for(int i = 1; i< n+1; i++){
			if(!visited[i]){
				dfs(i);
			}
		}
		
		for(int i = 2; i< n+1; i++){
			System.out.println(parents[i]);
		}
	}
	
	private static void dfs(int i){
		if(visited[i]){
			return;
		}
		visited[i] = true;
		for(int v : list[i]){
			if(!visited[v]){
				parents[v] = i;
				dfs(v);
			}
		}
	}
}
