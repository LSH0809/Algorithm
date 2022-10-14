package 이것이코딩테스트다.그리디.실전문제;

import java.io.*;
import java.util.*;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        List<Integer> list = new ArrayList<>();
        int answer = 0;

        for(int i = 0; i< N; i++){
            String lines = br.readLine();
            StringTokenizer str = new StringTokenizer(lines," ");
            for(int j = 0; j< M; j++){
                arr[i][j] = Integer.parseInt(str.nextToken());
            }
        }

        for(int i = 0; i< N ; i++){
            int min_value = Integer.MAX_VALUE;
            for(int j = 0; j< M; j++){
                min_value = Math.min(min_value,arr[i][j]);
            }
            list.add(min_value);
        }

        Integer max = Collections.max(list);

        bw.write(max.toString());
        bw.flush();
        bw.close();
        br.close();


    }
}
