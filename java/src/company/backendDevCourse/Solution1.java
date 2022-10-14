package company.backendDevCourse;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;

public class Solution1{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        char[] str = br.readLine().toCharArray();

        solution(str, n);

    }
    public static String solution(char[] str, int n) {
        char[] output = new char[n];
        boolean[] visited = new boolean[n];

        for(int i = 1; i< n + 1; i++) {
            getCases(str, output, visited, 0, n, i);
        }
        return "";
    }

    private static void getCases(char[] arr, char[] output, boolean[] visited, int depth, int n, int r){
        if(depth == r){
            for(int i = 0; i< r; i++){
                System.out.print(output[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i< n; i++){
            if(!visited[i]){
                visited[i] = true;
                output[depth] = arr[i];
                getCases(arr,output,visited,depth + 1, n, r);
                output[depth] = 0;
                visited[i] = false;
            }
        }
    }
}
// 1(5) 2(2) 0(0) 4(1) 3(4) 0 4 2 1 3
// 1(0) 2(3) 0(5) 4(6) 3(9) 1 2 0 4 3
// 0 -> 4 2 3 1
// 1 -> 2 4 3
// 2 -> 4 3
// 3 -> 4
// 0 번부터 각 점까지의 거리 5 2 4 1 -> 4 2 3 1
/*
모든 경우의 수 구해서
조건에 맞는지 확인하는 식으로 진행
    만약, 조건에 맞지 않는다면, break
    앞에서 부터 순서 지키면서 하니까 사전순으로 정렬되지 않을까
 */
