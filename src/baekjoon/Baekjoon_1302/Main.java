package baekjoon.Baekjoon_1302;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String key = br.readLine();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int maxValue = 0;

        for (String key : map.keySet()) {
            maxValue = Math.max(maxValue, map.get(key));
        }

        List<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);

        for (String str : keyList) {
            if (maxValue == map.get(str)) {
                System.out.println(str);
                break;
            }
        }
    }
}
