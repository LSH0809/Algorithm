package baekjoon.Baekjoon_15651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[m + 1];
        StringBuilder sb = new StringBuilder();
        solve(n,m,arr,0,sb);

        System.out.println(sb);

    }

    private static void solve(int n, int m, int[] arr, int idx,StringBuilder sb){
        if(idx == m){
            for(int i = 0; i< m; i++){
                sb.append(arr[i]).append(" ");
            }
            sb.append('\n');
            return;
        }

        for(int i = 1; i< n + 1; i++){
            arr[idx] = i;
            solve(n,m,arr,idx + 1,sb);
        }
    }
}
