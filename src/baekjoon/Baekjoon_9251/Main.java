package baekjoon.Baekjoon_9251;

import java.io.*;

public class Main {
	static char[] arr1;
	static char[] arr2;
	static int[][] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		arr1 = br.readLine().toCharArray();
		arr2 = br.readLine().toCharArray();
		
		dp = new int[arr1.length + 1][arr2.length + 1];
		
		for(int i = 1; i< arr1.length + 1; i++){
			for(int j = 1; j< arr2.length + 1; j++){
				if(arr1[i-1] == arr2[j-1]){
					dp[i][j] = dp[i-1][j-1] + 1;
				}else{
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j-1]);
				}
			}
		}
		bw.write(String.valueOf(dp[arr1.length][arr2.length]));
		bw.flush();

		bw.close();
		br.close();
	}
}
