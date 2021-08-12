package baekjoon.Baekjoon_1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        int count = 0;

        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            count++;
        }

        System.out.println(count);
    }
}
