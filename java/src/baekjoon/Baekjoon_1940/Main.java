package baekjoon.Baekjoon_1940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int answer;
    static int N, M;
    static int[] arr;

    public static void cal(int[] arr, int M) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] + arr[end] == M) {
                answer += 1;
                start += 1;
                end -= 1;
            } else if (arr[start] + arr[end] < M) {
                start += 1;
            } else {
                end -= 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        cal(arr, M);

        System.out.println(answer);
    }
}
