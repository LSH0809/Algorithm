package baekjoon.Baekjoon_2470;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, start, end, answer1, answer2;
    static int[] arr;

    public static void solve(int start, int end) {
        int minValue = Integer.MAX_VALUE;
        while (start < end) {
            int rawMid = arr[start] + arr[end];
            int mid = Math.abs(rawMid);
            if (minValue > mid) {
                minValue = mid;
                answer1 = start;
                answer2 = end;
            }
            if (rawMid < 0)
                start += 1;
            else
                end -= 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        start = 0;
        end = arr.length - 1;

        Arrays.sort(arr);

        solve(start, end);

        System.out.println(arr[answer1] + " " + arr[answer2]);
    }
}
