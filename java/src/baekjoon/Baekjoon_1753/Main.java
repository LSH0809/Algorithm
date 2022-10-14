package baekjoon.Baekjoon_1753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int v,e,k;
    static int[] dist;
    static List<Point>[] list;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        v = Integer.parseInt(st.nextToken()); // 정점의 개수
        e = Integer.parseInt(st.nextToken()); // 간선의 개수
        k = Integer.parseInt(br.readLine()); // 시작 정점의 번호
        list = new ArrayList[v + 1];
        dist = new int[v + 1];
    
        Arrays.fill(dist,Integer.MAX_VALUE); // 초기화
    
        for (int i = 1; i < v + 1; i++) {
            list[i] = new ArrayList<>();
        }
    
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
        
            list[start].add(new Point(end,weight)); // start에서 end로 가는 가중치
        }
    
        StringBuilder sb = new StringBuilder();
        solve(k);
        for (int i = 1; i < v + 1; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                sb.append("INF\n");
            } else {
                sb.append(dist[i])
                  .append("\n");
            }
        }
        System.out.println(sb);
    }
    
    private static void solve(int start){
      PriorityQueue<Point> queue = new PriorityQueue<>();
      boolean[] visited = new boolean[v + 1];
      queue.offer(new Point(start, 0));
      dist[start] = 0;

      while(!queue.isEmpty()){
          Point nowPoint = queue.poll();
          int cur = nowPoint.end;
          if(visited[cur]){
              continue;
          }
          visited[cur] = true;

//          for(Point point : list[cur]){
//              if(dist[point.end] > dist[cur] + point.weight){
//                  dist[point.end] = dist[cur] + point.weight;
//                  queue.offer(new Point(point.end, dist[point.end]));
//              }
//          }
          for(Point toPoint : list[nowPoint.end]){
              if(dist[toPoint.end] > dist[nowPoint.end] + toPoint.weight){
                  dist[toPoint.end] = dist[nowPoint.end] + toPoint.weight;
                  queue.offer(new Point(toPoint.end,dist[toPoint.weight]));
              }
          }
      }
    } // 다익스트라 알고리즘
    
    
    static class Point implements Comparable<Point>{
    
        int end;
        int weight;
    
        Point(int end, int weight) {
            this.weight =weight;
            this.end =end;
        }
        
        @Override
        public int compareTo(Point point){
            return this.weight - point.weight;
        }
    }
}
