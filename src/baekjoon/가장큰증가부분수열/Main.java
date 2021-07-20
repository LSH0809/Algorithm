package baekjoon.가장큰증가부분수열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        String line = bufferedReader.readLine();

        StringTokenizer st = new StringTokenizer(line, " ");

        int[] arr = new int[N + 1];
        int[] dp = new int[N + 1];
        int[] sum_dp = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
            sum_dp[i] = temp;
        }
        Arrays.fill(dp, 1);

        for (int i = 2; i < N + 1; i++) {
            for (int j = 1; j < i; j++) {
                if (arr[j] < arr[i] && dp[i] <= dp[j]) {
                    dp[i] = dp[j] + 1;
                }
                if (dp[i] > dp[j] && arr[i] > arr[j]) {
                    if (sum_dp[i] < sum_dp[j] + arr[i]) {
                        sum_dp[i] = sum_dp[j] + arr[i];
                    }
                }
            }
        }

        int max = 0;
        for (int i = 1; i < N + 1; i++) {
            max = Math.max(max, sum_dp[i]);
        }
        System.out.println(max);
    }
}
