package baekjoon.Baekjoon_1535;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, answer;
    static int[] L, J;

    public static int dfs(int idx, int joy, int health) {
        if (N == idx && health > 0) {
            answer = Math.max(answer, joy);
            return answer;
        }
        if (health > 0) {
            dfs(idx + 1, joy + J[idx], health - L[idx]);
            dfs(idx + 1, joy, health);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        L = new int[N];
        J = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            L[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            J[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0, 100);

        System.out.println(answer);
    }
}
