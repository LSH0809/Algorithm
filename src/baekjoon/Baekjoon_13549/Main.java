package baekjoon.Baekjoon_13549;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int answer = Integer.MAX_VALUE;
    static boolean[] visited = new boolean[100001];
    static int limit = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        solve(new Point(n, 0), k);

        bw.write(String.valueOf(answer));
        bw.flush();

        bw.close();
        br.close();
    }

    private static void solve(Point point, int k) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(point);

        while (!queue.isEmpty()) {
            Point now = queue.poll();
            visited[now.n] = true;

            if (now.n == k) {
                answer = Math.min(answer, now.time);
            }

            if(now.n < k) {
                if (now.n * 2 <= limit && !visited[now.n * 2]) {
                    queue.offer(new Point(now.n * 2, now.time));
                }

                if (!visited[now.n + 1] && now.n + 1 <= limit) {
                    queue.offer(new Point(now.n + 1, now.time + 1));
                }
            }
            if(now.n != 0) {
                if (!visited[now.n - 1]) {
                    queue.offer(new Point(now.n - 1, now.time + 1));
                }
            }
        }
    }

    static class Point {
        int n, time;

        public Point(int n, int time) {
            this.n = n;
            this.time = time;
        }
    }
}

