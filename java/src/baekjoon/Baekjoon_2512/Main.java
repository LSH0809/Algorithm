package baekjoon.Baekjoon_2512;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static long M, answer;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        M = Long.parseLong(br.readLine());

        Arrays.sort(arr);

        long start = 0;
        long end = arr[N - 1];

        while (start <= end) {
            long mid = (start + end) / 2;
            long sum = 0;
            for (int value : arr) {
                if (value >= mid)
                    sum += mid;
                else
                    sum += value;
            }
            if (sum > M)
                end = mid - 1;
            else {
                start = mid + 1;
                answer = Math.max(answer, mid);
            }
        }
        System.out.println(answer);
    }
}
