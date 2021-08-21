package 이것이코딩테스트다.그리디.실전문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        StringTokenizer str = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i< N; i++){
            arr[i] = Integer.parseInt(str.nextToken());
        }
        int sum = 0;

        Arrays.sort(arr);

        int max_value = arr[N-1];
        int second_value = arr[N-2];

        if(M % (K+1) == 0) {
            sum = (max_value * K + second_value) * (M / K);
        }else{
            sum = ((max_value * K + second_value) * (M / K) + max_value * (M %(K+1))) ;
        }

        System.out.println(sum);

    }
}
