package baekjoon.Baekjoon_1780;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] arr;
    static int zero, one, minusOne;

    public static boolean check(int x, int y, int len) {
        int value = arr[x][y];

        for (int i = x; i < x + len; i++) {
            for (int j = y; j < y + len; j++) {
                if (value != arr[i][j])
                    return false;
            }
        }
        return true;
    }

    public static void solve(int x, int y, int len) {
        if (check(x, y, len)) {
            if (arr[x][y] == -1) minusOne += 1;
            else if (arr[x][y] == 0) zero += 1;
            else one += 1;
            return;
        }

        int tempLen = len / 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                solve(x + i * tempLen, y + j * tempLen, tempLen);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        solve(0, 0, N);
        System.out.println(minusOne);
        System.out.println(zero);
        System.out.println(one);
    }
}
