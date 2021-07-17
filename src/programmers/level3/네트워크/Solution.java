package programmers.level3.네트워크;

import java.util.Stack;

class Solution {
    static boolean[] visited;
    static int[][] arr;
    static int N;

    public int solution(int n, int[][] computers) {
        int answer = 0;
        N = n;
        arr = computers;
        visited = new boolean[N];

        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                dfs(i);
                answer++;
            }
        }

        return answer;
    }

    public static void dfs(int start) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = true;

        while (!stack.isEmpty()) {
            for (int i = 0; i < N; i++) {
                if (arr[start][i] == 1 && visited[i] == false) {
                    visited[i] = true;
                    stack.push(i);
                    dfs(i);
                }
            }
            stack.pop();
        }
    }
}
