package baekjoon.Baekjoon_16973;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M, H, W, Sr, Sc, Fr, Fc;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Point {
        int x, y, count;

        public Point(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    public static int bfs(int x, int y, int endX, int endY) {
        Queue<Point> queue = new LinkedList<>();
        visited[x][y] = true;
        queue.add(new Point(x, y, 0));

        while (!queue.isEmpty()) {
            Point poll = queue.poll();
            int nowX = poll.x;
            int nowY = poll.y;

            if (nowX == endX && nowY == endY)
                return poll.count;

            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if (nextX < 1 || nextY < 1 || nextX > N || nextY > M || visited[nextX][nextY])
                    continue;
                if (!innerCheck(nextX, nextY))
                    continue;
                visited[nextX][nextY] = true;
                queue.add(new Point(nextX, nextY, poll.count + 1));

            }
        }
        return -1;
    }

    public static boolean innerCheck(int x, int y) {
        for (int i = x; i < x + H; i++) {
            for (int j = y; j < y + W; j++) {
                if (i < 1 || j < 1 || i > N || j > M || arr[i][j] == 1)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];

        for (int i = 1; i < N + 1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j < M + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine(), " ");

        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        Sr = Integer.parseInt(st.nextToken());
        Sc = Integer.parseInt(st.nextToken());
        Fr = Integer.parseInt(st.nextToken());
        Fc = Integer.parseInt(st.nextToken());

        int count = bfs(Sr, Sc, Fr, Fc);

        System.out.println(count);
    }
}
