package baekjoon.Baekjoon_1744;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int sep = 0;
        int sum = 0;
        boolean flag = false;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] == 0)
                flag = true;
        }

        Arrays.sort(arr);
        if (flag) {
            for (int i = 1; i < N; i++) {
                if (arr[i] < 0) {
                    sum += arr[i];
                } else {
                    sep = i;
                    break;
                }
            }
        } else {
            for (int i = 0; i < N; i++) {
                if (arr[i] < 0) {
                    sum += arr[i];
                } else {
                    sep = i;
                    break;
                }
            }
        }

        for (int i = N - 1; i > sep; i -= 2) {
            sum += (arr[i] * arr[i - 1]);
        }

        sum += arr[sep];

        System.out.println(sum);
    }
}
