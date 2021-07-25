package baekjoon.Baekjoon_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        int max_value = -1;
        char result = '?';

        String input = bufferedReader.readLine().toUpperCase(Locale.ROOT);

        for (int i = 0; i < input.length(); i++) {
            arr[input.charAt(i) - 'A']++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_value) {
                max_value = arr[i];
                result = (char) (i + 65);
            } else if (arr[i] == max_value) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
