package baekjoon.Baekjoon_11060;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];
        Arrays.fill(dp, -1);
        String line = bf.readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = 0;

        for (int i = 0; i < N - 1; i++) {
            if (dp[i] == -1) {
                continue;
            }
            for (int j = 1; j <= arr[i]; j++) {
                if (i + j < N) {
                    if (dp[i + j] == -1 || dp[i + j] > dp[i] + 1) {
                        dp[i + j] = dp[i] + 1;
                    }
                }
            }
        }
        System.out.println(dp[N - 1]);
    }
}
