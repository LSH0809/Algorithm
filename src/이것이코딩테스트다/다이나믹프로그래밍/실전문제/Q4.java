package 이것이코딩테스트다.다이나믹프로그래밍.실전문제;

import java.util.Scanner;

// 바닥 공사
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 3;

        for (int i =3; i <= n; i++) {
            dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 796796;
        }

        System.out.println(dp[n]);
    }
}
