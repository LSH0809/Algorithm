package baekjoon.Baekjoon_16953;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        int count = 1;
        answer = 0;

        solve(a, b, count);

        if (answer == 0) {
            answer = -1;
        }

        bw.write(String.valueOf(answer));
        bw.flush();

        bw.close();
        br.close();
    }

    private static void solve(long a, long b, int count) {
        if (a == b) {
            answer = count;
            return;
        } else if (a > b) {
            return;
        }
        solve(a * 2, b, count + 1);

        String str = a + "1";
        solve(Long.parseLong(str), b, count + 1);
    }
}
