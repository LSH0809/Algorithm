package baekjoon.Baekjoon_17179;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, L, Q;
    static int[] S;

    public static void solve(int[] arr, int cut) {
        int start = 0;
        int end = L;
        int numberOfCut = 0;
        int answer = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            int prevCake = arr[0];
            numberOfCut = 0;
            for (int i = 1; i <= M + 1; i++) {
                if (arr[i] - prevCake >= mid) {
                    numberOfCut += 1;
                    prevCake = arr[i];
                }
            }
            if (cut < numberOfCut) {
                start = mid + 1;
                answer = Math.max(answer, mid);
            } else {
                end = mid - 1;
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        S = new int[M + 2];

        for (int i = 1; i <= M; i++) {
            S[i] = Integer.parseInt(br.readLine());
        }
        S[0] = 0;
        S[M + 1] = L;

        while (N-- > 0) {
            Q = Integer.parseInt(br.readLine());
            solve(S, Q);
        }
    }
}
