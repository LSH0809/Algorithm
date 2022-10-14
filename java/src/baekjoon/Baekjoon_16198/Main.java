package baekjoon.Baekjoon_16198;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int N, answer;
    static List<Integer> list;

    public static void dfs(int sum) {
        if (list.size() <= 2) {
            answer = Math.max(answer, sum);
            return;
        }

        for (int i = 1; i < list.size() - 1; i++) {
            int getValue = list.get(i);
            int calValue = list.get(i - 1) * list.get(i + 1);
            list.remove(i);
            dfs(sum + calValue);
            list.add(i, getValue);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        answer = Integer.MIN_VALUE;
        list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        dfs(0);
        System.out.println(answer);
    }
}
