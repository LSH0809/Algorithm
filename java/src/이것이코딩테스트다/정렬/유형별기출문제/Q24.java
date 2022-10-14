package 이것이코딩테스트다.정렬.유형별기출문제;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 안테나
public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i =0 ; i< n; i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        // 중간 값을 출력
        System.out.println(list.get((n-1) / 2));
    }
}
