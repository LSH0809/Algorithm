package baekjoon.Baekjoon_2468;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, count, answer;
    static int[][] arr, copyArr;
    static boolean[][] visited;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void solve(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < n) {
                if (!visited[nextX][nextY] && copyArr[nextX][nextY] == 1)
                    solve(nextX, nextY);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        answer = 1;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int v = 1; v < 101; v++) {
            visited = new boolean[n][n];
            copyArr = new int[n][n];
            count = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] <= v)
                        copyArr[i][j] = 0;
                    else
                        copyArr[i][j] = 1;
                }
            }

            for (int p = 0; p < n; p++) {
                for (int q = 0; q < n; q++) {
                    if (!visited[p][q] && copyArr[p][q] == 1) {
                        solve(p, q);
                        count += 1;
                    }
                }
            }
            answer = Math.max(answer, count);
        }
        System.out.println(answer);
    }
}
