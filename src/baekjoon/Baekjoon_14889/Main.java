package baekjoon.Baekjoon_14889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] arr;
    static boolean[] visited;
    static int answer = Integer.MAX_VALUE;

    public static void solve(int depth, int idx) {
        if (depth == n / 2) {
            answer = Math.min(answer, getDiff());
            return;
        }
        for (int i = idx; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                solve(depth + 1, i + 1);
                visited[i] = false;
            }
        }
    }

    public static int getDiff() {
        int value1 = 0;
        int value2 = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (visited[i] && visited[j]) {
                    value1 += arr[i][j];
                    value1 += arr[j][i];
                } else if (!visited[i] && !visited[j]) {
                    value2 += arr[i][j];
                    value2 += arr[j][i];
                }
            }
        }
        return Math.abs(value1 - value2);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        solve(0, 0);

        System.out.println(answer);
    }
}
