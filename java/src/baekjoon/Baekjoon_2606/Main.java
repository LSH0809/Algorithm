package baekjoon.Baekjoon_2606;

import java.io.*;
import java.util.StringTokenizer;

class Main {
    static int[][] arr;
    static boolean[] visited;
    static int n, k;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        arr = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        int answer = solve(1);

        bw.write(String.valueOf(answer));
        bw.flush();

        bw.close();
        br.close();
    }

    private static int solve(int idx) {
        visited[idx] = true;

        for (int i = 1; i < n + 1; i++) {
            if (!visited[i] && arr[idx][i] == 1) {
                count += 1;
                solve(i);
            }
        }

        return count;
    }
}
