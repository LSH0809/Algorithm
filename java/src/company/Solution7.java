package company;

import java.util.*;

class Solution7 {
    static int answer;

    public static int solution(int[] arr, int k, int t) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        answer = 0;
        for (int i = 1; i <= n; i++) {
            solve(arr, visited, 0, n, i, t, k);
        }

        return answer;
    }

    private static void solve(int[] arr, boolean[] visited, int idx, int n, int r, int t, int k) {
        if (r == 0) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    list.add(arr[i]);
                }
            }
            if (isInLimit(list, t, k)) {
                answer += 1;
            }
            return;
        }

        for (int i = idx; i < n; i++) {
            visited[i] = true;
            solve(arr, visited, i + 1, n, r - 1, t, k);
            visited[i] = false;
        }
    }

    private static boolean isInLimit(List<Integer> list, int t, int k) {
        int sum = 0;
        if (list.size() < k) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            if (sum > t) {
                break;
            }
        }
        if (sum > t) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 5, 8, 3, 1};
        int[] arr2 = {1, 1, 2, 2};
        int[] arr3 = {1, 2, 3, 2};

        int k1 = 3;
        int k2 = 2;
        int k3 = 2;

        int t1 = 11;
        int t2 = 3;
        int t3 = 2;

        System.out.println(solution(arr1, k1, t1));
        System.out.println(solution(arr2, k2, t2));
        System.out.println(solution(arr3, k3, t3));
    }
}