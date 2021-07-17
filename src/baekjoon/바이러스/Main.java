package baekjoon.바이러스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    static int[][] arr;
    static boolean[] visited;
    static int N, K;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        K = Integer.parseInt(bufferedReader.readLine());

        arr = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= K; i++) {
            String line = bufferedReader.readLine();
            StringTokenizer st = new StringTokenizer(line, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        dfs(1);

        System.out.println(count);
    }

    public static void dfs(int start) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = true;

        while (!stack.isEmpty()) {
            for (int i = 1; i <= N; i++) {
                if (arr[start][i] == 1 && visited[i] == false) {
                    stack.push(i);
                    visited[i] = true;
                    count++;
                    dfs(i);
                }
            }
            stack.pop();
        }
    }
}
