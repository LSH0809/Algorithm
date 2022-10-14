package baekjoon.Baekjoon_17626;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] dp;
    static int n;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        dp = new int[n+1];
        solve();
        System.out.println(dp[n]);
    }
    
    public static void solve(){
       dp[1] = 1;
       for(int i = 2; i< n + 1; i++){
           dp[i] = Integer.MAX_VALUE;
           for(int j = 1; j * j <= i; j++){
               int temp = i - j * j;
               dp[i] = Math.min(dp[i], dp[temp] + 1);
           }
       }
    }
}
