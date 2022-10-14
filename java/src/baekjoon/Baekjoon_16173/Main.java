package baekjoon.Baekjoon_16173;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        if (solve(0, 0)) {
            bw.write("HaruHaru");
        } else {
            bw.write("Hing");
        }

        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean solve(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            int nextX = now[0];
            int nextY = now[1];

            if (map[nextX][nextY] == -1) {
                return true;
            }

            int toRight = nextX + map[now[0]][now[1]];
            int toDown = nextY + map[now[0]][now[1]];

            if (toRight < n) {
                if (!visited[toRight][nextY]) {
                    queue.offer(new int[]{toRight, nextY});
                    visited[toRight][nextY] = true;
                }
            }
            if (toDown < n) {
                if (!visited[nextX][toDown]) {
                    queue.offer(new int[]{nextX, toDown});
                    visited[nextX][toDown] = true;
                }
            }
        }
        return false;
    }
}


/*
visited boolean 2차원 배열 하지 않으면 메모리 초과 발생
 */