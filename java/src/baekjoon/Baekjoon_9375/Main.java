package baekjoon.Baekjoon_9375;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        int test_case = Integer.parseInt(bufferedReader.readLine());
        int total = 0;
        int temp;
        int answer;

        while (total < test_case) {
            total++;
            int clothes_num = Integer.parseInt(bufferedReader.readLine());
            map.clear();
            answer = 1;
            for (int i = 0; i < clothes_num; i++) {
                String line = bufferedReader.readLine();
                StringTokenizer st = new StringTokenizer(line, " ");
                String clothes_name = st.nextToken();
                String type = st.nextToken();

                if (map.get(type) == null) {
                    map.put(type, 1);
                } else {
                    map.put(type, map.get(type) + 1);
                }
            }

            for (String keys : map.keySet()) {
                temp = map.get(keys);
                answer *= (temp + 1);
            }
            System.out.println(answer - 1);
        }
    }
}
