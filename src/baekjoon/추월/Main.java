package baekjoon.추월;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Main {
    static Map<Integer, String> arr1 = new HashMap<>();
    static Map<Integer, String> arr2 = new HashMap<>();
    static int answer = 0;
    static boolean[] count;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            String value1 = bufferedReader.readLine();
            arr1.put(i, value1);
        }

        for (int j = 0; j < n; j++) {
            String value2 = bufferedReader.readLine();
            arr2.put(j, value2);
        }

        answer = -1;
        for (Map.Entry<Integer, String> element1 : arr1.entrySet()) {
            int element1_key = element1.getKey();
            String element1_value = element1.getValue();
            for (Map.Entry<Integer, String> element2 : arr2.entrySet()) {
                if (element1_value.equals(element2.getValue())) {
                    if (element2.getKey() > element1_key) {
                        int temp = element2.getKey() - element1_key;
                        answer = Math.max(answer,temp);
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
