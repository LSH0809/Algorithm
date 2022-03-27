package baekjoon.Baekjoon_1916;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int[] dist;
    static boolean[] visited;
    static ArrayList<Node>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        list = new ArrayList[n + 1];
        dist = new int[n + 1];
        visited = new boolean[n + 1];

        for(int i = 1; i< n + 1; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i< m; i++){
            st = new StringTokenizer(br.readLine()," ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            list[from].add(new Node(to,weight));
        }
        st = new StringTokenizer(br.readLine()," ");
        int start = Integer.parseInt(st.nextToken());
        int destination = Integer.parseInt(st.nextToken());

        dijkstra(start);

        bw.write(String.valueOf(dist[destination]));
        bw.flush();
        bw.close();
        br.close();
    }

    private static void dijkstra(int start){
        PriorityQueue<Node> queue = new PriorityQueue<>();
        Arrays.fill(dist,Integer.MAX_VALUE);

        queue.add(new Node(start, 0));
        dist[start] = 0;

        while(!queue.isEmpty()){
            Node node = queue.poll();
            int to = node.to;

            if(!visited[to]){
                visited[node.to] = true;

                for(Node nextNode : list[to]){
                    if(dist[nextNode.to] >= dist[to] + nextNode.weight){
                        dist[nextNode.to] = dist[to] + nextNode.weight;
                        queue.add(new Node(nextNode.to, dist[nextNode.to]));
                    }
                }
            }
        }
    }

    static class Node implements Comparable<Node> {
        int to;
        int weight;

        public Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o) {
            return this.weight - o.weight;
        }
    }
}
