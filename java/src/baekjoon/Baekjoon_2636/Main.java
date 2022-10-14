package baekjoon.Baekjoon_2636;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, cheeseCount, time, answer;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void solve() {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited = new boolean[N][M];
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int next_x = now[0] + dx[i];
                int next_y = now[1] + dy[i];

                if (next_x < 0 || next_x >= N || next_y < 0 || next_y >= M || visited[next_x][next_y])
                    continue;
                if (arr[next_x][next_y] == 1) {
                    cheeseCount -= 1;
                    arr[next_x][next_y] = 0;
                } else if (arr[next_x][next_y] == 0)
                    queue.offer(new int[]{next_x, next_y});
                visited[next_x][next_y] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 1)
                    cheeseCount += 1;
            }
        }

        while (cheeseCount != 0) {
            time += 1;
            answer = cheeseCount;
            solve();
        }

        System.out.println(time);
        System.out.println(answer);
    }
}
