package baekjoon.Baekjoon_1654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int K, N;
    static long[] arr;

    public static long solve(long start, long end) {
        long result = 0;
        long count = 0;
        while (start <= end) {
            long mid = (start + end) / 2;
            count = 0;
            for (int i = 0; i < K; i++) {
                if (arr[i] >= mid) {
                    count += (arr[i] / mid);
                }
            }

            if (count < N) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new long[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);
        long result = solve(1, arr[K - 1]);

        System.out.println(result);
    }
}
