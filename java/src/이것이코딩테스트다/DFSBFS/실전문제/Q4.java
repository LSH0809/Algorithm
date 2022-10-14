package 이것이코딩테스트다.DFSBFS.실전문제;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Node{
    private int x;
    private int y;

    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }
}

public class Q4 {
    public static int n,m;
    public static int[][] graph = new int[201][201];

    public static int[] dx = {-1,1,0,0};
    public static int[] dy = {0,0,-1,1};

    public static int bfs(int x, int y){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x,y));

        while(!queue.isEmpty()){
            Node node = queue.poll();
            x = node.getX();
            y = node.getY();

            for(int i = 0; i< 4; i++){
                int next_x = x + dx[i];
                int next_y = y + dy[i];

                if(next_x < 0 || next_x >=n || next_y < 0 || next_y >= m){
                    continue;
                }

                if(graph[next_x][next_y] == 0)
                    continue;

                if(graph[next_x][next_y] == 1){
                    graph[next_x][next_y] = graph[x][y] + 1;
                    queue.offer(new Node(next_x,next_y));
                }
            }
        }

        return graph[n-1][m-1];
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // N, M을 공백을 기준으로 구분하여 입력 받기
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기

        // 2차원 리스트의 맵 정보 입력 받기
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < m; j++) {
                graph[i][j] = str.charAt(j) - '0';
            }
        }

        // BFS를 수행한 결과 출력
        System.out.println(bfs(0, 0));
    }
}
