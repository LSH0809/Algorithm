package baekjoon.Baekjoon_18111;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ReMain {
    static int[][] arr;
    static int n, m, b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Map<Integer, Integer> resultMap = new HashMap<>();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        int minHeight = Integer.MAX_VALUE;
        int maxHeight = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                int value = Integer.parseInt(st.nextToken());
                arr[i][j] = value;
                minHeight = Math.min(minHeight, value);
                maxHeight = Math.max(maxHeight, value);
            }
        }

        for(int h = minHeight; h < maxHeight + 1; h++){
            int second = 0;
            int inventory = b;

            for(int i = 0; i< n; i++){
                for(int j = 0; j< m; j++){
                    if(arr[i][j] <= h){
                        second += (h - arr[i][j]);
                        inventory -= (h - arr[i][j]);
                    }
                }
            }
        }

        bw.close();
        br.close();
    }
}
