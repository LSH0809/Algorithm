package baekjoon.Baekjoon_2805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String input_line = br.readLine();

        st = new StringTokenizer(input_line, " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[N];

        String arr_line = br.readLine();
        st = new StringTokenizer(arr_line, " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = (int) 1e9;
        int result = 0;

        while (start <= end) {
            long sum = 0;
            int mid = (start + end) / 2;
            for (int i = 0; i < N; i++) {
                if (arr[i] > mid)
                    sum += arr[i] - mid;
            }
            if (sum < M) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }
        System.out.println(result);
    }
}
