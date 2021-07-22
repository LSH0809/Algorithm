package baekjoon.Baekjoon_1697;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int[] visited;
    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input_line = bufferedReader.readLine();
        StringTokenizer st = new StringTokenizer(input_line, " ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visited = new int[100001];

        if (N == K) {
            System.out.println(0);
        } else {
            bfs(N, K);
        }
    }

    public static void bfs(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        visited[n] = 1;

        while (!queue.isEmpty()) {
            int now = queue.poll();

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) {
                    next = now + 1;
                } else if (i == 1) {
                    next = now - 1;
                } else {
                    next = now * 2;
                }

                if (next == k) {
                    System.out.println(visited[now]);
                    return;
                }

                if (next >= 0 && next < visited.length && visited[next] == 0) {
                    queue.offer(next);
                    visited[next] = visited[now] + 1;
                }
            }
        }
    }
}
