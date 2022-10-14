package 이것이코딩테스트다.이진탐색.실전문제;

import java.util.Scanner;

// 떡볶이 떡 만들기
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
//        int end = (int)1e9;
        int end = Integer.MAX_VALUE;
        long result = 0;

        while (start <= end) {
            long total = 0;
            int mid = (start + end) / 2;

            for (int i = 0; i < N; i++) {
                if (arr[i] > mid)
                    total += arr[i] - mid;
            }

            if (total < M) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }
        System.out.println(result);
    }
}
