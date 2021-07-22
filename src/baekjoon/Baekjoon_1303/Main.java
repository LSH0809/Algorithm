package baekjoon.Baekjoon_1303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static boolean[][] visited;
    static String[][] arr;
    static int n, m;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int white_count = 0;
    static int black_count = 0;

    static class Node {
        int x;
        int y;

        public Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));
        String s = bufferedReader.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new String[m][n];
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            String line = bufferedReader.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = line.substring(j, j + 1);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == false) {
                    if (arr[i][j].equals("B")) {
                        int num = bfs("B", i, j);
                        black_count += Math.pow(num, 2);
                    } else if (arr[i][j].equals("W")) {
                        int num = bfs("W", i, j);
                        white_count += Math.pow(num, 2);
                    }
                }
            }
        }
        System.out.println(white_count + " " + black_count);
    }

    public static int bfs(String color, int y, int x) {
        int count = 1;
        Queue<Node> queue = new LinkedList<>();
        visited[y][x] = true;
        queue.offer(new Node(y, x));

        while (!queue.isEmpty()) {
            Node now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int now_x = now.x + dx[i];
                int now_y = now.y + dy[i];

                if (now_x >= 0 && now_x < n && now_y >= 0 && now_y < m) {
                    if (visited[now_y][now_x] == false && color.equals(arr[now_y][now_x])) {
                        queue.offer(new Node(now_y, now_x));
                        visited[now_y][now_x] = true;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
