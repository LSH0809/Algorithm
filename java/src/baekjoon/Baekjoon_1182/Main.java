package baekjoon.Baekjoon_1182;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, S, answer;
    static int[] arr;

    private static void solve(int index, int sum) {
        if (index == N) {
            if (sum == S) answer += 1;
            return;
        }

        solve(index + 1, sum + arr[index]);
        solve(index + 1, sum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        answer = 0;

        st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solve(0, 0);

        if (S == 0) {
            answer -= 1;
        }
        System.out.println(answer);
    }
}
