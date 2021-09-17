package 이것이코딩테스트다.DFSBFS.유형별기출문제;

import java.util.ArrayList;
import java.util.Scanner;

// 연산자 끼워 넣기
public class Q19 {
    public static int n;
    // 연사을 수행하고자 하는 수 리스트
    public static ArrayList<Integer> arr = new ArrayList<>();
    // 더하기 빼기 곱하기 나누기 연산자 개수
    public static int add, sub,mul,divi;

    // 최소값과 최대값 초기화
    public static int maxValue = (int)1e9;
    public static int minValue = (int)-1e9;

    // 깊이 우선 탐색 (DFS) 메소드
    public static void dfs(int idx, int now){
        if(idx == n){
            minValue = Math.min(minValue,now);
            maxValue = Math.max(maxValue,now);
        }else{
            if(add > 0){
                add -= 1;
                dfs(idx + 1, now + arr.get(idx));
                add += 1;
            }
            if(sub > 0){
                sub -= 1;
                dfs(idx +1, now - arr.get(idx));
                sub += 1;
            }
            if(mul > 0){
                mul -= 1;
                dfs(idx + 1, now * arr.get(idx));
                mul += 1;
            }
            if(divi > 0){
                divi -= 1;
                dfs(idx + 1, now / arr.get(idx));
                divi += 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 0; i< n; i++){
            int x = sc.nextInt();
            arr.add(x);
        }

        add = sc.nextInt();
        sub = sc.nextInt();
        mul = sc.nextInt();
        divi = sc.nextInt();

        // dfs 메소드 호출
        dfs(1,arr.get(0));

        // 최대값과 최소값 차례대로 출력
        System.out.println(maxValue);
        System.out.println(minValue);
    }
}
