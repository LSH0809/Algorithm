package baekjoon.연결요소의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static boolean[] visited;
    static int[][] arr;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            String line = bufferedReader.readLine();
            StringTokenizer str = new StringTokenizer(line, " ");
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        int answer = 0;
        visited = new boolean[N + 1];

        for (int i = 1; i < N + 1; i++) {
            if (visited[i] == false) {
                dfs(i);
                answer++;
            }
        }
        System.out.println(answer);
    }

    public static void dfs(int start) {
        visited[start] = true;

        for (int i = 1; i < N + 1; i++) {
            if (arr[start][i] == 1 && visited[i] == false) {
                dfs(i);
            }
        }
    }
}
