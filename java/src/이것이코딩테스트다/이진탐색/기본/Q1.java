package 이것이코딩테스트다.이진탐색.기본;

import java.util.Scanner;

// 재귀 함수로 구현한 이진 탐색
public class Q1 {

    public static int binarySearch(int[] arr, int start, int target, int end) {
        if (start > end)
            return -1;
        int mid = (start + end) / 2;

        if (arr[mid] == target)
            return mid;
        else if (arr[mid] > target)
            return binarySearch(arr, start, target, mid - 1);
        else
            return binarySearch(arr, mid + 1, target, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = binarySearch(arr, 0, target, n - 1);
        if (result == -1) {
            System.out.println("존재하지 않는 값입니다.");
        } else {
            System.out.println(result + 1);
        }
    }
}
