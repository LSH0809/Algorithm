package baekjoon.Baekjoon_1015;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Pair[] pairs = new Pair[n];
        int[] arr = new int[n];

        for(int i = 0; i< n; i++){
            int val = Integer.parseInt(st.nextToken());
            pairs[i] = new Pair(i,val);
        }

        Arrays.sort(pairs, (o1, o2) -> {
            if(o1.value - o2.value < 0){
                return -1;
            }else{
                return 1;
            }
        });

        for(int i = 0; i< n; i++){
            arr[pairs[i].idx] = i;
        }

        for(int i = 0; i< n; i++){
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
    }

    static class Pair{
        int idx;
        int value;

        public Pair(int idx, int value) {
            this.idx = idx;
            this.value = value;
        }
    }
}
