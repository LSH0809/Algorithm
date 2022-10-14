package baekjoon.Baekjoon_9663;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] arr;
    static int N;
    static int answer;

    public static void solve(int depth) {
        if (depth == N) {
            answer += 1;
            return;
        }
        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            if (check(depth)) {
                solve(depth + 1);
            }
        }
    }

    public static boolean check(int idx) {
        for (int i = 0; i < idx; i++) {
            if (arr[idx] == arr[i])
                return false;
            if (Math.abs(idx - i) == Math.abs(arr[i] - arr[idx]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        solve(0);
        System.out.println(answer);
    }
}
