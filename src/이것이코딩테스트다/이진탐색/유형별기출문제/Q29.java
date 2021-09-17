package 이것이코딩테스트다.이진탐색.유형별기출문제;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 공유기 설치
public class Q29 {
    public static void main(String[] args) {
        // 집의 개수(N)와 공유기의 개수 (C)를 입력받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        // 전체 집의 좌표 정보를 입력받기
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0 ; i< n; i++){
            arr.add(sc.nextInt());
        }

        // 이진 탐색을 위해 정렬 수행
        Collections.sort(arr);

        int start = -1; // 가능한 최소 거리
        int end = arr.get(n-1) - arr.get(0); // 가능한 최대 거리
        int result = 0;

        while(start <= end){
            // mid는 가장 인접한 두 공유기 사이의 거리 gap을 의미
            int mid = (start + end) / 2;
            // 첫째 찝에는 무조건 공유기를 설치한다고 가정
            int value = arr.get(0);
            int count = 1;
            // 현재의 mid값을 이용해 공유기를 설치하기
            for(int i= 1; i< n; i++){// 앞에서 부터 설치
                if(arr.get(i) >=value + mid){
                    value = arr.get(i);
                    count += 1;
                }
            }
            // c개 이상의 공유기를 설치할 수 있는 경우, 거리를 증가시키기
            if(count >= c){
                start = mid + 1;
                result = mid;
            }else{// c개 이상의 공유기를 설치할 수 없는 경우, 거리를 감소시키기
                end = mid - 1;
            }
        }
        System.out.println(result);
    }
}
