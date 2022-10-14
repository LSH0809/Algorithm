package baekjoon.Baekjoon_2624;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int T, k;
    static int[][] arr;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        arr = new int[k][2];
        dp = new int[T + 1];
        StringTokenizer st = null;
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        dp[0] = 1;
        for (int i = 0; i < k; i++) {
            int num = arr[i][0];
            for (int j = T; j >= num; j--) {
                for (int k = 1; k <= arr[i][1]; k++) {
                    if (j - num * k < 0)
                        break;
                    dp[j] += dp[j - num * k];
                }
            }
        }
        System.out.println(dp[T]);
    }
}
