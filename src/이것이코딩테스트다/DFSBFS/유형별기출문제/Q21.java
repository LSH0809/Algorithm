package 이것이코딩테스트다.DFSBFS.유형별기출문제;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 인구 이동
class Position{
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
public class Q21 {
    // 땅의크기(n) 최소값(l), 최대값(r) 입력받기
    public static int n,l,r;
    public static int totalCount = 0;

    // 전체 나라의 정보 입력받기
    public static int[][] graph = new int[50][50];
    public static int[][] unions = new int[50][50];

    public static int[] dx = {-1,0,1,0};
    public static int[] dy = {0,-1,0,1};

    // 특정 위치에서 출발하여 모든 연합을 체크한 뒤에 데이터 갱신
    public static void process(int x, int y, int index){
        // (x,y)의 위치와 연결된 나라(연합) 정보를 담는 리스트
        ArrayList<Position> united = new ArrayList<>();
        united.add(new Position(x,y));

        // bfs 를 위한 큐 라이브러리 사용
        Queue<Position> queue = new LinkedList<>();
        queue.offer(new Position(x,y));
        unions[x][y]  = index; // 현재 연합의 번호 할당
        int summary = graph[x][y]; // 현재 연합의 전체 인구 수
        int count = 1; // 현재 연합의 국가 수
        // 큐가 빌 때까지 반복(bfs)
        while(!queue.isEmpty()){
            Position pos = queue.poll();
            x = pos.getX();
            y = pos.getY();
            // 현재 위치에서 4가지 방향을 확인하며
            for(int i = 0; i< 4; i++){
                int next_x = x + dx[i];
                int next_y = y + dy[i];
                // 바로 옆에 있는 나라를 확인하여
                if(0 <= next_x && next_x < n && 0<= next_y && next_y < n && unions[next_x][next_y] == -1){
                    // 옆에 있는 나라와 인구 차이가 l명이상 r명 이하라면
                    int gap = Math.abs(graph[next_x][next_y] - graph[x][y]);
                    if(l <= gap && gap <=r){
                        queue.offer(new Position(next_x,next_y));
                        // 연합에 추가하기
                        unions[next_x][next_y] = index;
                        summary += graph[next_x][next_y];
                        count += 1;
                        united.add(new Position(next_x,next_y));
                    }
                }
            }
        }

        // 연합 국가끼리 인구를 분배
        for(int i =0 ; i< united.size(); i++){
            x = united.get(i).getX();
            y = united.get(i).getY();
            graph[x][y] = summary / count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        l = sc.nextInt();
        r = sc.nextInt();

        for(int i =0; i< n; i++){
            for(int j =0;j < n; j++){
                graph[i][j] = sc.nextInt();
            }
        }

        // 더이상 연구 이동을 할 수 없을 때까지 반복
        while(true){
            for(int i = 0; i< n; i++){
                for(int j= 0; j< n; j++){
                    unions[i][j] = -1;
                }
            }

            int index = 0;
            for(int i =0 ; i< n; i++){
                for(int j =0 ; j< n; j++){
                    if(unions[i][j] == -1){ // 해당 나라가 아직 처리 되지 않았다면
                        process(i,j,index);
                        index += 1;
                    }
                }
            }
            // 모든 인구 이동이 끝난 경우
            if(index == n * n)
                break;
            totalCount += 1;
        }

        System.out.println(totalCount);
    }
}


