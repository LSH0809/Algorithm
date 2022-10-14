package baekjoon.Baekjoon_2667;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static int n,count;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int[][] arr;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        List<Integer> answerList = new ArrayList<>();

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];

        for(int i = 0; i< n; i++){
            String input = br.readLine();
            for(int j = 0; j< n; j++){
                arr[i][j] = Integer.parseInt(String.valueOf(input.charAt(j)));
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(arr[i][j] == 1 && !visited[i][j]){
                    count = 1;
                    answerList.add(dfs(i,j));
                }
            }
        }
        Collections.sort(answerList);

        sb.append(answerList.size()).append("\n");
        for(Integer i : answerList){
            sb.append(i).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static int dfs(int x, int y){
        visited[x][y] = true;

        for(int i = 0; i< 4; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < n){
                if(!visited[nextX][nextY] && arr[nextX][nextY] == 1){
                    dfs(nextX,nextY);
                    count += 1;
                }
            }
        }
        return count;
    }
}
