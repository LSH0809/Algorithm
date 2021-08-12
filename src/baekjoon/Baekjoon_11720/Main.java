package baekjoon.Baekjoon_11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        char[] line = bf.readLine().toCharArray();
        int sum = 0;

        for (int i = 0; i < line.length; i++) {
            sum += Character.getNumericValue(line[i]);
        }

        System.out.println(sum);
    }
}
