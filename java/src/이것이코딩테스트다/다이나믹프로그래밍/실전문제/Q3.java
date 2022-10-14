package 이것이코딩테스트다.다이나믹프로그래밍.실전문제;

import java.util.Scanner;

// 개미 전사
public class Q3 {
    public static int[] dp = new int[100];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        dp[0] = arr[0];
        dp[1] = Math.max(dp[0],arr[1]);

        for(int i = 2; i< n; i++){
            dp[i] = Math.max(dp[i-1],dp[i-2] + arr[i]);
        }

        System.out.println(dp[n-1]);
    }
}
