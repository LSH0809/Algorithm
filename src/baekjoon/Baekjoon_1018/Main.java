package baekjoon.Baekjoon_1018;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static boolean[][] arr;

    public static int solve(int x, int y) {
        int count = 0;
        boolean compare_char = arr[x][y];

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (arr[i][j] != compare_char) {
                    count += 1;
                }
                compare_char = !compare_char;
            }
            compare_char = !compare_char;
        }

        return Math.min((64 - count), count);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        arr = new boolean[M][N];
        int compare_num = Integer.MAX_VALUE;

        for (int i = 0; i < M; i++) {
            String arr_line = br.readLine();
            for (int j = 0; j < N; j++) {
                if (arr_line.charAt(j) == 'B') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }

            }
        }

        for (int i = 0; i + 7 < M; i++) {
            for (int j = 0; j + 7 < N; j++) {
                int solve = solve(i, j);
                compare_num = Math.min(compare_num, solve);
            }
        }

        bw.write(String.valueOf(compare_num));
        bw.flush();

        bw.close();
        br.close();
    }
}
