package baekjoon.Baekjoon_14225;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr;
    static boolean[] visited;

    static void dfs(int idx, int sum) {
        if (idx == N)
            visited[sum] = true;
        else {
            dfs(idx + 1, sum);
            dfs(idx + 1, sum + arr[idx]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        visited = new boolean[20 * 100000];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);

        while (visited[num]) {
            num += 1;
        }
        System.out.println(num);
    }
}
