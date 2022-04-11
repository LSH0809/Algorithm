package programmers.level3.가장먼노드;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    static int[] dist;
    static List<Point>[] list;
    static final int INF = 987654321;

    public static void main(String[] args) {
        int n = 6;
        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};

        System.out.println(solution(n, edge));
    }

    public static int solution(int n, int[][] edge) {
        list = new ArrayList[n + 1];
        dist = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < edge.length; i++) {
            list[edge[i][0]].add(new Point(edge[i][1], 1));
            list[edge[i][1]].add(new Point(edge[i][0], 1));
        }
        Arrays.fill(dist,INF);
        dist[0] = 0;
        dist[1] = 0;

        solve(n,1);

        int maxValue = 0;
        for(int i = 0; i< n + 1; i++){
            maxValue = Math.max(dist[i], maxValue);
        }
        int count = 0;
        for(int i = 0; i< n + 1; i++){
            if(dist[i] == maxValue){
                count += 1;
            }
        }
        return count;
    }

    private static void solve(int n, int start) {
        PriorityQueue<Point> queue = new PriorityQueue<>();
        queue.offer(new Point(start, 0));

        while(!queue.isEmpty()){
            Point nowPoint = queue.poll();

            for(int i = 0; i< list[nowPoint.end].size(); i++){
                Point nextPoint = list[nowPoint.end].get(i);
                if(dist[nextPoint.end] > nowPoint.weight + nextPoint.weight){
                    dist[nextPoint.end] = nowPoint.weight + nextPoint.weight;
                    queue.offer(new Point(nextPoint.end,dist[nextPoint.end]));
                }
            }
        }
    }

    static class Point implements Comparable<Point> {
        int end, weight;

        public Point(int end, int weight) {
            this.end = end;
            this.weight = weight;
        }

        @Override
        public int compareTo(Point o) {
            return this.weight - o.weight;
        }
    }
}