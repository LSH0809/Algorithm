package baekjoon.Baekjoon_14719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int H, W;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        int[] arr = new int[W];
        int answer = 0;

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < W; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int now = 0;
        int leftValue = 0;
        int rightValue = 0;
        for (int i = 1; i < W - 1; i++) {
            now = arr[i];
            leftValue = arr[i];
            rightValue = arr[i];
            for (int j = 0; j < i; j++) {
                if (arr[j] > now) {
                    leftValue = Math.max(arr[j], leftValue);
                }
            }
            for (int j = i + 1; j < W; j++) {
                if (arr[j] > now) {
                    rightValue = Math.max(arr[j], rightValue);
                }
            }
            answer += Math.min(leftValue, rightValue) - now;

        }
        System.out.println(answer);
    }
}
