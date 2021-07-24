package baekjoon.Baekjoon_4963;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int W, H;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, -1, -1, 1, 1, 1};
    static int[] dy = {1, -1, 0, -1, 1, 0, 1, -1};
    static int count;

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = bufferedReader.readLine();
            StringTokenizer str = new StringTokenizer(input, " ");
            W = Integer.parseInt(str.nextToken());
            H = Integer.parseInt(str.nextToken());

            if (W == 0 & H == 0) {
                return;
            }

            map = new int[H][W];
            visited = new boolean[H][W];
            count = 0;

            for (int i = 0; i < H; i++) {
                String line = bufferedReader.readLine();
                StringTokenizer st = new StringTokenizer(line, " ");
                for (int j = 0; j < W; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (map[i][j] == 1 && visited[i][j] == false) {
                        dfs(i, j);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void dfs(int x, int y) {
        Stack<Node> stack = new Stack<>();
        stack.push(new Node(x, y));
        visited[x][y] = true;

        while (!stack.isEmpty()) {

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < H && ny >= 0 && ny < W) {
                    if (map[nx][ny] == 1 && visited[nx][ny] == false) {
                        stack.push(new Node(nx, ny));
                        visited[nx][ny] = true;
                        dfs(nx, ny);
                    }
                }
            }
            stack.pop();
        }
    }
}
