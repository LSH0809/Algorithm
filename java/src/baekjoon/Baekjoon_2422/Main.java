package baekjoon.Baekjoon_2422;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N,M;
    static int[][] arr;
    static boolean[] visited;

    public static void solve(int idx, int depth){
        if(depth == 3){

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][N];
        visited = new boolean[N];

        for(int i = 0; i< N; i++){
            st = new StringTokenizer(br.readLine()," ");
            int x= Integer.parseInt(st.nextToken()) - 1;
            int y= Integer.parseInt(st.nextToken()) - 1;

            arr[x][y] = 1;
            arr[y][x] = 1;
        }
    }
}
