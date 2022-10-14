package company.socar;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/*
간선, 노트, 시간이 주어짐, 0번 노드에서 시작 -> 연결되어있는 곳 어디든 가도됨.
근데 k 변수인 시간이 딱 0이 될 때 어느 노드든 자전거를 반납해야함
이때 가능한 노드 번호(자전거 대여소 번호)를 정렬 하여 반환
 */
public class solution1 {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        int n1 = 6;
        int k1 = 17;
        int[][] roads1 = {{5, 4, 6}, {5, 2, 5}, {0, 4, 2}, {2, 3, 3}, {1, 2, 7}, {0, 1, 3}};

        solution(n1,k1,roads1);
    }

    public static int[] solution(int n, int k, int[][] roads){
        int[][] arr = new int[n + 1][n + 1];

        for(int i = 0; i< roads.length; i++){
            for(int j = 0; j< roads[0].length; j++){
                arr[roads[i][0]][roads[i][1]] = roads[i][2];
            }
        }

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        dfs(arr,0, k);

        System.out.println("check");
        for(int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

        return new int[]{1};
    }

    public static void dfs(int[][] arr, int start, int time){
        if(time == 0){
            list.add(start);
        }
        Stack<Integer> stack = new Stack<>();
        for(int j = 0; j < arr.length; j++){
            if(arr[start][j] > 0){
                stack.push(j);
            }
        }
        while(!stack.isEmpty()){
            int pop = stack.pop();
            dfs(arr, pop, time - arr[start][pop]);
        }
    }

    static class Point{
        int from, to,time;

        public Point(int from, int to,int time) {
            this.from = from;
            this.to = to;
            this.time= time;
        }
    }
}
