package baekjoon.Baekjoon_2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        String[] str_arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < str_arr.length; i++) {
            if (input.contains(str_arr[i])) {
                input = input.replaceAll(str_arr[i], "o");
            }
        }
        System.out.println(input.length());
    }
}
