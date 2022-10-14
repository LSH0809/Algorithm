package 이것이코딩테스트다.DFSBFS.실전문제;

import java.io.*;
import java.util.StringTokenizer;

public class Q3 {
    public static int n,m;
    public static int[][] graph = new int[1000][1000];

    public static boolean dfs(int x, int y){
        if( x<= - 1 || x >= n || y <= -1 || y >=m)
            return false;
        if(graph[x][y] == 0){
            graph[x][y] = 1;

            dfs(x-1,y);
            dfs(x,y-1);
            dfs(x,y+1);
            dfs(x+1,y);
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputLine = br.readLine();
        StringTokenizer st = new StringTokenizer(inputLine," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int count = 0;

        for(int i = 0; i< n; i++){
            String line = br.readLine();
            StringTokenizer str = new StringTokenizer(line, "");
            for(int j = 0; j< m ; j++){
                graph[i][j] = Integer.parseInt(str.nextToken());
            }
        }

        for(int i =0 ; i< n; i++){
            for(int j= 0; j<m; j++){
                if(dfs(i,j))
                    count += 1;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();

    }
}
