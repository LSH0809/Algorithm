package baekjoon.Baekjoon_15881;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String input = br.readLine();
        String compare = "pPAp";
        int count = 0;
        int i = 0;
        while (i + 3 < n) {
            if (input.charAt(i) == 'p' && input.charAt(i + 1) == 'P' && input.charAt(i + 2) == 'A' && input.charAt(i + 3) == 'p') {
                count += 1;
                i += 4;
            } else {
                i += 1;
            }
        }
        System.out.println(count);
    }
}
