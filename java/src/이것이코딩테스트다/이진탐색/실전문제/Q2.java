package 이것이코딩테스트다.이진탐색.실전문제;

import java.util.Scanner;

// 부품 찾기
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[1000001];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[num] = 1;
        }

        int m = sc.nextInt();
        int[] targets = new int[m];

        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            if (arr[targets[i]] == 1) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
