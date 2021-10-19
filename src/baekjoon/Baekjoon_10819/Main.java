package baekjoon.Baekjoon_10819;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int maxValue = Integer.MIN_VALUE;
    static boolean[] visited;
    static int[] newArr, arr;

    public static void solve(int depth, int N, int[] arr) {
        int sum = 0;
        if (depth == N) {
            for (int i = 0; i < N - 1; i++) {
                sum += Math.abs(newArr[i + 1] - newArr[i]);
            }
            maxValue = Math.max(maxValue, sum);
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                newArr[depth] = arr[i];
                solve(depth + 1, N, arr);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        newArr = new int[N];
        visited = new boolean[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        solve(0, N, arr);
        System.out.println(maxValue);
    }
}
