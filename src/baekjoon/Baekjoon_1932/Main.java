package baekjoon.Baekjoon_1932;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        StringTokenizer st = null;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[][] dp = new int[n + 1][n + 1];
        dp[0][0] = arr[0][0];

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp1 = 0;
                int temp2 = 0;
                if (j != 0) {
                    temp1 = Math.max(dp[i - 1][j], dp[i - 1][j - 1]);
                } else {
                    temp2 = dp[i - 1][0];
                }
                dp[i][j] = arr[i][j] + Math.max(temp1, temp2);
            }
        }

        int answer = Arrays.stream(dp[n - 1]).max().getAsInt();

        bw.write(String.valueOf(answer));
        bw.flush();

        bw.close();
        br.close();

    }
}
