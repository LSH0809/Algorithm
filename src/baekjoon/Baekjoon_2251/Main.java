package baekjoon.Baekjoon_2251;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int[] arr = new int[3];
    static boolean[][][] visited = new boolean[201][201][201];
    static List<Integer> answerList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        } // 최대 용량

        solve(0, 0, arr[2]);

        Collections.sort(answerList);

        StringBuffer sb = new StringBuffer();

        for (Integer i : answerList) {
            sb.append(i).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }

    private static void solve(int x, int y, int z) {
        if (visited[x][y][z]) {
            return;
        }

        visited[x][y][z] = true;

        if (x == 0) {
            answerList.add(z);
        }


        if (arr[0] >= x + y) {
            solve(x + y, 0, z);
        } else {
            solve(arr[0], x + y - arr[0], z);
        }

        if (arr[0] >= x + z) {
            solve(x + z, y, 0);
        } else {
            solve(arr[0], y, x + z - arr[0]);
        }

        if (arr[1] >= y + x) {
            solve(0, y + x, z);
        } else {
            solve(x + y - arr[1], arr[1], z);
        }

        if (arr[1] >= y + z) {
            solve(x, y + z, 0);
        } else {
            solve(x, arr[1], y + z - arr[1]);
        }

        if (arr[2] >= x + z) {
            solve(0, y, x + z);
        } else {
            solve(x + z - arr[2], y, arr[2]);
        }

        if (arr[2] >= y + z) {
            solve(x, 0, y + z);
        } else {
            solve(x, y + z - arr[2], arr[2]);
        }
    }
}
