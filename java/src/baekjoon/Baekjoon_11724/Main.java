package baekjoon.Baekjoon_11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int[][] arr;
    static boolean[] visited;
    static int N, M, result;

    public static void solve(int idx) {
        if (visited[idx])
            return;
        visited[idx] = true;
        for (int i = 1; i <= N; i++) {
            if (arr[idx][i] == 1)
                solve(i);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int x, y;
        result = 0;
        arr = new int[N + 1][N + 1];
        visited = new boolean[N + 1];
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                solve(i);
                result += 1;
            }
        }
        System.out.println(result);
    }
}
