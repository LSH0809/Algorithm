package baekjoon.Baekjoon_1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Map<String, String> map = new HashMap<>();


        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            String input = br.readLine();
            String idx = String.valueOf(i);
            map.put(idx, input);
            map.put(input, idx);
        }

        for (int i = 0; i < M; i++) {
            System.out.println(map.get(br.readLine()));
        }
    }
}
