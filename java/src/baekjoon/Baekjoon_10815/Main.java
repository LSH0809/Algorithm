package baekjoon.Baekjoon_10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] arr;
    private static int binarySearch(int target,int start, int end, int[] arr){
        int mid;

        while(start <= end){
            mid = (start + end) / 2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                start = mid + 1;
            else
                end = mid -1;
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = null;

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i =0 ; i< N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        st = new StringTokenizer(br.readLine(), " ");

        for(int i =0 ; i< M; i++){
            int temp_result = binarySearch(Integer.parseInt(st.nextToken()),0,arr.length-1,arr);
            if(temp_result != -1)
                sb.append("1").append(" ");
            else
                sb.append("0").append(" ");
        }

        System.out.println(sb.toString());
    }
}
