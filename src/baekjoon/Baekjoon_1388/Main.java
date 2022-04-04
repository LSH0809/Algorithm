package baekjoon.Baekjoon_1388;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static char[][] map;
    static boolean[][] visited;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new char[n][m];
        visited = new boolean[n][m];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]) {
                    if (map[i][j] == '|') {
                        downSolve(i, j);
                    } else {
                        rowSolve(i, j);
                    }
                    answer += 1;
                }
            }
        }

        bw.write(answer + "");
        bw.flush();

        bw.close();
        br.close();
    }

    private static void downSolve(int x, int y) {
        Queue<Point> columnQueue = new LinkedList<>();
        columnQueue.offer(new Point(x, y));
        visited[x][y] = true;

        while (!columnQueue.isEmpty()) {
            Point now = columnQueue.poll();
            if (map[now.x][now.y] == '|') {
                int nextX = now.x + 1;
                if (nextX < n) {
                    if (!visited[nextX][now.y] && map[nextX][now.y] == '|') {
                        columnQueue.offer(new Point(nextX, now.y));
                        visited[nextX][now.y] = true;
                    }
                }
            }
        }
    }

    private static void rowSolve(int x, int y) {
        Queue<Point> rowQueue = new LinkedList<>();
        rowQueue.offer(new Point(x, y));
        visited[x][y] = true;

        while (!rowQueue.isEmpty()) {
            Point now = rowQueue.poll();
            if (map[now.x][now.y] == '-') {
                int nextY = now.y + 1;
                if (nextY < m) {
                    if (!visited[now.x][nextY] && map[now.x][nextY] == '-') {
                        rowQueue.offer(new Point(now.x, nextY));
                        visited[now.x][nextY] = true;
                    }
                }
            }
        }
    }

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
