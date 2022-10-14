package 이것이코딩테스트다.최단경로.기본구현;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

// 개선된 다익스트라 알고리즘 구현

class Node implements Comparable<Node>{
    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return index;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public int compareTo(Node other){
        if(this.distance < other.distance){
            return -1;
        }
        return 1;
    }
    // distance값이(거리)(비용) 더 작은 것이 우선수위를 가지도록 설정한다.
}


public class Q2 {
    public static final int INF = (int)1e9; // 무한을 의미한다.
    public static int n,m,start;
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>(); // 각 노드에 연결되어 있는 노드에 대한 정보를 담는 배열
    public static int[] d = new int[100001]; // 최단 거리 테이블

    public static void dijkstra(int start){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start,0));
        d[start] = 0;

        while(!pq.isEmpty()){
            Node node = pq.poll();
            int dist = node.getDistance(); // 현재 노드까지의 비용
            int now_index = node.getIndex(); // 현재 노트 인덱스

            if(d[now_index] < dist) continue;
            for(int i = 0; i< graph.get(now_index).size(); i++){
                int cost = d[now_index] + graph.get(now_index).get(i).getDistance();

                if(cost < d[graph.get(now_index).get(i).getIndex()]){
                    d[graph.get(now_index).get(i).getIndex()] = cost;
                    pq.offer(new Node(graph.get(now_index).get(i).getIndex(),cost));
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        for(int i =0; i<= n; i++){
            graph.add(new ArrayList<Node>());
        }

        for(int i = 0; i< m; i++){
            int a = sc.nextInt();
            int b= sc.nextInt();
            int c = sc.nextInt();

            graph.get(a).add(new Node(b,c));
        }

        Arrays.fill(d,INF);

        dijkstra(start);

    }
}
