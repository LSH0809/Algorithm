package company.fasto;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution4 {
    static boolean[] visited;

    public static void main(String[] args) {
        int[] truck1 = {1,4,5,2,4};
        int[] truck2 = {2,7,4,9};

        int[] weight1 = {2,4,4,3,2};
        int[] weight2 = {7,6,8};

        System.out.println(Arrays.toString(solution(truck1, weight1)));
        System.out.println(Arrays.toString(solution(truck2, weight2)));
    }

    public static int[] solution(int[] truck, int[] w) {
        int[] answer = new int[w.length];
        visited = new boolean[truck.length];
        boolean flag = false;
        int asInt = Arrays.stream(truck).max().getAsInt();

        for(int i = 0; i< w.length; i++){
            if(w[i] > asInt){
                answer[i] = -1;
                continue;
            }
            for(int j = 0; j< truck.length; j++){
                flag = false;
                if(visited[j]){
                    continue;
                }
                if(w[i] <= truck[j]){
                    truck[j] -= w[i];
                    flag = true;
                    if(truck[j] < 0){
                        visited[j] = true;
                    }
                }else{
                    answer[i] = -1;
                }

                if(flag){
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        return answer;
    }
}

/*
    트럭 라인 존재
    짐 라인 존재
    컨테이너에 짐이 올려져서 오른쪽으로 이동
    트럭이 대기
    짐 싣기
    트럭 인덱스 짐 배열에 담아서 반환

    점수
    15 / 30
 */