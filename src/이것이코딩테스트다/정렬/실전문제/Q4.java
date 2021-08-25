package 이것이코딩테스트다.정렬.실전문제;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 두 배열의 원소 교체
public class Q4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Integer[] a_list = new Integer[N];
        for (int i = 0; i < N; i++) {
            a_list[i] = sc.nextInt();
        }

        Integer[] b_list = new Integer[N];
        for (int i = 0; i < N; i++) {
            b_list[i] = sc.nextInt();
        }

        Arrays.sort(a_list);
        Arrays.sort(b_list, Collections.reverseOrder());

        for (int i = 0; i < K; i++) {
            if (a_list[i] < b_list[i]) {
                a_list[i] = b_list[i];
            } else {
                break;
            }
        }

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += a_list[i];
        }

        System.out.println(sum);
    }
}
