package organization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutationCase {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        for (int i = 1; i < n + 1; i++) {
            permutationBackTracking(arr, 0, n, i);
        }

        int[] output = new int[n];
        boolean[] visited = new boolean[n];
        for (int i = 1; i < n + 1; i++) {
            permutation(arr, output, visited, 0, n, i);
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        Collections.sort(list);
    }

    private static void permutationBackTracking(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutationBackTracking(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    private static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }
    /*
    변수 n : 배열 arr의 전체 길이
    변수 r : 몇개 출력할 것인지 정보가 담긴 변수
    간단하고 코드가 깔끔하지만, 순열들의 순서가 보장되지 않는다.
    즉 정렬이 필요할 경우, 추가 과정이 필요하다.
    */

    private static void permutation(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation(arr, output, visited, depth + 1, n, r);
                output[depth] = 0; // 원래대로 돌린다는 의미이지만, 필요한 코드는 아니다.
                visited[i] = false;
            }
        }
    }
    /*
    변수 n : 배열 arr의 전체 길이
    변수 r : 몇개 출력할 것인지 정보가 담긴 변수
    변수 output : DFS를 돌면서, output 배열에 값을 담는다.
    visited 1차원 배열을 통한 완전탐색을 이용한 순열
    앞서 swap 메소드를 활용했을 때와는 다르게 순서가 보장된다.
     */
}
