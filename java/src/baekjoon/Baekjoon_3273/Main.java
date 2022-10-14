package baekjoon.Baekjoon_3273;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int result;

    public static void cal(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] + arr[end] == target) {
                start += 1;
                result += 1;
            } else if (arr[start] + arr[end] < target) {
                start += 1;
            } else if (arr[start] + arr[end] > target) {
                end -= 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(br.readLine());
        result = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        cal(arr, x);

        System.out.println(result);
    }
}
