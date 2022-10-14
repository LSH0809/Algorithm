package baekjoon.Baekjoon_11053;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n];
        int[] memo = new int[n + 1];

        for(int i = 0; i< n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int len = 0;
        int idx = 0;

        for(int i = 0; i< n; i++){
            if(arr[i] > memo[len]){
                len += 1;
                memo[len] = arr[i];
            }else{
                idx = binarySearch(memo, 0,len,arr[i]);
                memo[idx] = arr[i];
            }
        }
        bw.write(String.valueOf(len));
        bw.flush();

        bw.close();
        br.close();
    }

    private static int binarySearch(int[] memo, int left, int right, int target){
        int mid = 0;

        while(left < right){
            mid = (left + right) / 2;
            if(memo[mid] < target){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return right;
    }
}
