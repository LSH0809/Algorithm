package baekjoon.Baekjoon_1543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        String input = bf.readLine();
        int answer = 0;

        for (int i = 0; i < line.length() - input.length() + 1; i++) {
            if (line.startsWith(input, i)) {
                i = i + input.length() - 1;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
