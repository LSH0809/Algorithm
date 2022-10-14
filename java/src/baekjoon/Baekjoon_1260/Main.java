package baekjoon.Baekjoon_1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static int[][] map;
    public static boolean[] visited;
    public static int n,m,v;

    public static void dfs(int start){
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = true;

        System.out.print(start + " ");

        while(!stack.isEmpty()){
            for(int i = 1; i<=n; i++){
                if(map[start][i] == 1 && !visited[i]){
                    stack.push(i);
                    visited[i] = true;
                    dfs(i);
                }
            }
            stack.pop();
        }
    }

    public static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while(!queue.isEmpty()){
            int x = queue.poll();
            System.out.print(x + " ");
            for(int i = 1; i<= n; i++){
                if(map[x][i] == 1 && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((System.in)));
        String s = bufferedReader.readLine();
        StringTokenizer st = new StringTokenizer(s," ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        map = new int[n+1][n+1];
        visited = new boolean[n+1];
        for(int i = 0; i< n+1; i++){
            Arrays.fill(map[i],0);
        }
        Arrays.fill(visited,false);

        for(int i = 0; i< m; i++){
            String edge = bufferedReader.readLine();
            StringTokenizer st1 = new StringTokenizer(edge," ");
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            map[a][b] = 1;
            map[b][a] = 1;
        }

        dfs(v);
        Arrays.fill(visited,false);
        System.out.println();
        bfs(v);
    }
}
