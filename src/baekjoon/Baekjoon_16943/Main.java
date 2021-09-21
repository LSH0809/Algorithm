package baekjoon.Baekjoon_16943;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int answer, b;
    static int[] a;
    static String input;

    public static void solve(int nowNumber, int count, int len, boolean[] visited) {
        if (count == input.length()) {
            answer = Math.max(answer, nowNumber);
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            if (visited[i] || (a[i] == 0 && count == 0))
                continue;
            if (nowNumber * 10 + a[i] > b)
                continue;
            visited[i] = true;
            solve(nowNumber * 10 + a[i], count + 1, input.length(), visited);
            visited[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        input = st.nextToken();
        a = new int[input.length()];
        b = Integer.parseInt(st.nextToken());
        answer = -1;
        boolean[] visited = new boolean[input.length()];
        for (int i = 0; i < input.length(); i++) {
            a[i] = input.charAt(i) - '0';
        }
        solve(0, 0, input.length(), visited);

        System.out.println(answer);
    }
}
