package baekjoon.Baekjoon_1436;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int num = 666;

        while (count != N) {
            num += 1;
            if (String.valueOf(num).contains("666")) {
                count += 1;
            }
        }

        bw.write(String.valueOf(num));
        bw.flush();

        bw.close();
        br.close();
    }
}
