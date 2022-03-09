package baekjoon.Baekjoon_4963;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int w,h,count;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1,0,1,0,-1,-1,1,1};
    static int[] dy = {0,-1,0,1,1,-1,1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            count = 0;

            if(w == 0 && h == 0){
                break;
            }

            arr = new int[h][w];
            visited = new boolean[h][w];

            for(int i = 0; i< h; i++){
                st = new StringTokenizer(br.readLine()," ");
                for(int j = 0; j< w; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i = 0; i< h; i++){
                for(int j = 0; j< w; j++){
                    if(arr[i][j] == 1 && !visited[i][j]){
                        count += 1;
                        dfs(i,j);
                    }
                }
            }

            sb.append(count).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(int x, int y){
        visited[x][y] = true;

        for(int i = 0; i< 8; i++){
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(nextX >= 0 && nextY >= 0 && nextX < h && nextY < w){
                if(!visited[nextX][nextY] && arr[nextX][nextY] == 1){
                    dfs(nextX,nextY);
                }
            }
        }
    }
}