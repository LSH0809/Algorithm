package baekjoon.Baekjoon_2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuffer sb = null;
        StringTokenizer st = null;
        while (T-- > 0) {
            sb = new StringBuffer();
            st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            for (int i = 0; i < S.length(); i++) {
                for (int j = 0; j < R; j++) {
                    sb.append(S.charAt(i));
                }
            }
            System.out.println(sb);
        }
    }
}
