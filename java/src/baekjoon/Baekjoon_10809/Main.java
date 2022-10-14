package baekjoon.Baekjoon_10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        for (int i = 0; i < input.length(); i++) {
            int index = input.charAt(i) - 'a';
            if (arr[index] == -1)
                arr[index] = i;
            else
                continue;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
