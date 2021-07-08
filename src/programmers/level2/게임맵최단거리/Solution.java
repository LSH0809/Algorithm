package programmers.level2.게임맵최단거리;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int x;
    int y;

    Node(int _x, int _y) {
        this.x = _x;
        this.y = _y;
    }
}

public class Solution {
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] dp;

    public int solution(int[][] maps) {
        int row = maps.length;
        int column = maps[0].length;
        visited = new boolean[row][column];
        dp = new int[row][column];
        bfs(0, 0, maps);

        if (dp[row - 1][column - 1] > 1) {
            return dp[row - 1][column - 1];
        } else {
            return -1;
        }
    }

    static void bfs(int x, int y, int[][] maps) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));
        visited[x][y] = true;
        dp[x][y] = 1;

        while (!queue.isEmpty()) {
            Node now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int now_x = now.x + dx[i];
                int now_y = now.y + dy[i];

                if (now_x < 0 || now_x >= maps.length || now_y < 0 | now_y >= maps[0].length) {
                    continue;
                }

                if (maps[now_x][now_y] == 0) {
                    continue;
                }

                if (!visited[now_x][now_y]) {
                    visited[now_x][now_y] = true;
                    dp[now_x][now_y] = dp[now.x][now.y] + 1;
                    queue.offer(new Node(now_x, now_y));
                }
            }
        }
    }
}
