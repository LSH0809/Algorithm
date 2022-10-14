package baekjoon.Baekjoon_2178;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int[][] arr,dp;
    static boolean[][] visited;
    static int n,m;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n+1][m+1];
        dp = new int[n+1][m+1];
        visited = new boolean[n+1][m+1];
        
        for(int i = 1; i < n+1; i++){
            String input = br.readLine();
            for(int j = 1; j< m+1; j++){
                arr[i][j] = input.charAt(j-1) - '0';
            }
        }
        solve(1,1);
    
        System.out.println(dp[n][m] + 1);
    }
    
    private static void solve(int x, int y){
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x,y));
        visited[x][y] = true;
        
        while(!queue.isEmpty()){
            Point point = queue.poll();
            
            for(int i = 0; i< 4; i++){
                int nextX = point.x + dx[i];
                int nextY = point.y + dy[i];
                
                if(nextX > 0 && nextY > 0 && nextX < n+1 && nextY < m+1){
                    if(arr[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                        queue.offer(new Point(nextX,nextY));
                        visited[nextX][nextY] = true;
                        dp[nextX][nextY] = dp[point.x][point.y] + 1;
                    }
                }
            }
        }
    }
    
    static class Point{
        int x,y;
    
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
