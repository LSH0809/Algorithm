package baekjoon.Baekjoon_2805;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static long[] arr;
    static int n;
    static long m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        n = Integer.parseInt(st.nextToken());
        m = Long.parseLong(st.nextToken());

        arr = new long[n];
        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i< n; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        bw.write(binarySearch(1,arr[n-1]));
        bw.flush();

        bw.close();
        br.close();
    }

    private static String binarySearch(long start, long end){
        long sum = 0;
        while(start <= end){
            sum = 0;
            long mid = (start + end) / 2;
            for(int i = 0; i< arr.length; i++){
                if(arr[i] > mid) {
                    sum += (arr[i] - mid);
                }
            }

            if(sum < m){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return String.valueOf(end);
    }
}
