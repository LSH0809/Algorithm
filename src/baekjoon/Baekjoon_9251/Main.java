package baekjoon.Baekjoon_9251;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static char[] arr1;
	static char[] arr2;
	static int[][] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		arr1 = br.readLine().toCharArray();
		arr2 = br.readLine().toCharArray();
		
		dp = new int[arr1.length][arr2.length];
		
		System.out.println(solve(arr1.length - 1 ,arr2.length - 1 ));
	}
	
	private static int solve(int x, int y) {
		if (x == -1 || y == -1) {
			return 0;
		}
		
		if(dp[x][y] == 0){
			if(arr1[x] == arr2[y]){
				dp[x][y] = solve(x-1,y-1) + 1;
			}else{
				dp[x][y] = Math.max(solve(x-1,y),solve(x,y-1));
			}
		}
		return dp[x][y];
	}
}
