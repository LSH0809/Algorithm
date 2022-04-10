package baekjoon.Baekjoon_6064;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int answer = -1;
            st = new StringTokenizer(br.readLine(), " ");
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int lcm = lcm(m, n);
            int temp = 0;

            while (temp * m < lcm) {
                if ((temp * m + x - y) % n == 0) {
                    answer = temp * m + x;
                    break;
                }
                temp += 1;
            }
            sb.append(answer).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }

    private static int lcm(int x, int y) {
        return x * y / gcd(x, y);
    }

    private static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}
