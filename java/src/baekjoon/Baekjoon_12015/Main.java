package baekjoon.Baekjoon_12015;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] arr,dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        dp = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i< n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int len = 0;
        int idx = 0;

        for(int i = 0; i< n; i++){
            if(arr[i] > dp[len]){
                len += 1;
                dp[len] = arr[i];
            }else{
                idx = binarySearch(0,len,arr[i]);
                dp[idx] = arr[i];
            }
        }
        System.out.println(len);
    }

    private static int binarySearch(int left, int right, int target){
        while(left < right){
            int mid = (left + right) / 2;
            if(dp[mid] < target){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return right;
    }
}
