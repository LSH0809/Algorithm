package 이것이코딩테스트다.그리디.유형별기출문제;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[m+1];

        for(int i = 0; i< n; i++){
            arr[sc.nextInt()] += 1;
        }

        int result = 0;

        for(int i = 1; i <= m; i++){
            n -= arr[i];
            result += n * arr[i];
        }

        System.out.println(result);
    }
}
