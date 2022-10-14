package baekjoon.Baekjoon_10026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};
    static int N;
    static char arr[][];
    static boolean[][] visited;

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        char color = arr[x][y];
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (!visited[nextX][nextY] && arr[nextX][nextY] == color) {
                if (nextX > 0 && nextY > 0 && nextX <= N && nextY <= N) {
                    dfs(nextX, nextY);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new char[N + 2][N + 2];
        visited = new boolean[N + 2][N + 2];
        int allCount = 0;
        int redGreenCount = 0;
        for (int i = 1; i < N + 1; i++) {
            String input = br.readLine();
            for (int j = 1; j < N + 1; j++) {
                arr[i][j] = input.charAt(j - 1);
            }
        }

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                if (!visited[i][j]) {
                    dfs(i, j);
                    allCount += 1;
                }
            }
        }

        for (boolean[] i : visited) Arrays.fill(i, false);

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                if (arr[i][j] == 'R')
                    arr[i][j] = 'G';
            }
        }

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                if (!visited[i][j]) {
                    dfs(i, j);
                    redGreenCount += 1;
                }
            }
        }

        System.out.println(allCount + " " + redGreenCount);
    }
}
