package baekjoon.Baekjoon_20055;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, K;
    static int[] container;
    static boolean[] check;
    static int blank;
    static int result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        container = new int[N * 2 + 1];
        check = new boolean[N * 2 + 1];
        blank = 0;
        result = 0;
        container[0] = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i < N * 2 + 1; i++) {
            container[i] = Integer.parseInt(st.nextToken());
        }

        do {
            ++result;
            moveContainer();
            stepBy();
        } while (blank < K);

        System.out.println(result);
    }

    static void moveContainer() {
        container[0] = container[N * 2];
        check[0] = check[N * 2];
        for (int i = N * 2; i > 1; i--) {
            container[i] = container[i - 1];
            check[i] = check[i - 1];
        }
        container[1] = container[0];
        check[1] = check[0];

    }

    static void stepBy() {
        if (check[N]) {
            check[N] = false;
        }

        for (int i = N - 1; i > 0; i--) {
            if (!check[i])
                continue;
            if (container[i + 1] > 0 && !check[i + 1]) {
                check[i] = false;
                check[i + 1] = true;
                if (--container[i + 1] == 0)
                    blank++;
            }
        }
        if (container[1] > 0 && !check[1]) {
            check[1] = true;
            if (--container[1] == 0)
                blank++;
        }

        if (check[N])
            check[N] = false;

    }
}