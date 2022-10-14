package baekjoon.Baekjoon_1600;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int k, w, h, answer;
    static int[][] arr;
    static boolean[][][] visited;
    static int[] horseDx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] horseDy = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] monkeyDx = {-1, 0, 1, 0};
    static int[] monkeyDy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        k = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        answer = Integer.MAX_VALUE;

        arr = new int[h][w];
        visited = new boolean[h][w][31];

        for (int i = 0; i < h; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < w; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solve(0, 0);

        if (answer == Integer.MAX_VALUE) {
            answer = -1;
        }

        bw.write(String.valueOf(answer));
        bw.flush();

        bw.close();
        br.close();
    }

    private static void solve(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y, 0, k));
        visited[x][y][k] = true;

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            if(point.x == w - 1 && point.y == h - 1){
                answer = Math.min(answer, point.count);
                System.out.println(answer);
                return;
            }

            if(point.x < 0 || point.y < 0 || point.x >= w || point.y >= h){
                continue;
            }
            if(arr[point.y][point.x] == 1){
                continue;
            }
            if(visited[point.y][point.x][point.k]){
                continue;
            }
            visited[point.y][point.x][point.k] = true;
            for(int i = 0; i < 4; i++){
                int nextX = point.x + monkeyDx[i];
                int nextY = point.y + monkeyDy[i];

                queue.offer(new Point(nextX,nextY, point.count + 1, point.k));
            }

            if(point.k == 0)    continue;
            for(int i = 0; i< 8; i++){
                int nextX = point.x + horseDx[i];
                int nextY = point.y + horseDy[i];

                queue.offer(new Point(nextX,nextY,point.count + 1, point.k - 1));
            }
        }
    }

    static class Point {
        int x, y, count, k;

        public Point(int x, int y, int count, int k) {
            this.x = x;
            this.y = y;
            this.count = count;
            this.k = k;
        }
    }
}

/*
4
6 10
0 0 1 1 1 1
0 1 1 0 1 1
0 1 1 1 1 0
0 1 1 1 1 0
0 1 1 1 1 0
0 1 1 1 1 0
0 1 1 0 1 1
0 1 1 1 1 1
1 1 1 1 0 0
1 0 0 1 1 0
-1
Process finished with exit code 0
-1
Process finished with exit code 0

 */