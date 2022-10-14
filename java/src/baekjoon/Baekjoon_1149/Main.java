package baekjoon.Baekjoon_1149;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n,answer;
	static int[][] arr;
	static int[][] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][3];
		dp = new int[n][3];
		answer = 0;
		
		for(int i = 0; i< n; i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j = 0; j< 3; j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dp[0][0] = arr[0][0];
		dp[0][1] = arr[0][1];
		dp[0][2] = arr[0][2];
	
		int answer = Math.min(solve(n-1,0),Math.min(solve(n-1,1),solve(n-1,2)));
		System.out.println(answer);
	}
	
	private static int solve(int idx, int color){
		if(dp[idx][color] == 0){
			if(color == 0){
				dp[idx][0] = Math.min(solve(idx-1,1),solve(idx-1,2)) + arr[idx][0];
			}else if(color == 1){
				dp[idx][1] = Math.min(solve(idx-1,0),solve(idx-1,2)) + arr[idx][1];
			}else if(color == 2){
				dp[idx][2] = Math.min(solve(idx-1,0),solve(idx-1,1)) + arr[idx][2];
			}
		}
		return dp[idx][color];
	}
}
