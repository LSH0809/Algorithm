package company.dktechin;

import java.io.*;

public class Solution1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int input = Integer.parseInt(br.readLine());

        int answer = solution(input);

        bw.write(String.valueOf(answer));
        bw.flush();

        bw.close();
        br.close();
    }

    private static int solution(int n) {
        int[] dp = new int[12];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i < 12; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[n];
    }
}
