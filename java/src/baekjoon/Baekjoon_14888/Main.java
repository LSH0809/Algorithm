package baekjoon.Baekjoon_14888;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int minAnswer = Integer.MAX_VALUE;
    static int maxAnswer = Integer.MIN_VALUE;
    static int n;
    static int[] numberArr;
    static int[] operatorArr = new int[4];


    public static void dfs(int idx, int startNumber) {
        if (idx == n) {
            maxAnswer = Math.max(startNumber, maxAnswer);
            minAnswer = Math.min(startNumber, minAnswer);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operatorArr[i] > 0) {
                operatorArr[i] -= 1;

                switch (i) {
                    case 0:
                        dfs(idx + 1, startNumber + numberArr[idx]);
                        break;
                    case 1:
                        dfs(idx + 1, startNumber - numberArr[idx]);
                        break;
                    case 2:
                        dfs(idx + 1, startNumber * numberArr[idx]);
                        break;
                    case 3:
                        dfs(idx + 1, startNumber / numberArr[idx]);
                        break;
                }
                operatorArr[i] += 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        numberArr = new int[n];

        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            numberArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            operatorArr[i] = Integer.parseInt(st.nextToken());
        }
        dfs(1, numberArr[0]);

        System.out.println(maxAnswer);
        System.out.println(minAnswer);
    }
}
