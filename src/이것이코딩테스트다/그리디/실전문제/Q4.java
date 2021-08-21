package 이것이코딩테스트다.그리디.실전문제;

import java.io.*;
import java.util.StringTokenizer;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;
        while(N != 1) {
            if (N % K == 0) {
                N /= K;
            } else {
                N -= 1;
            }
            count += 1;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
