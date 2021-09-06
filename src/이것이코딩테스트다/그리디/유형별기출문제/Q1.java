package 이것이코딩테스트다.그리디.유형별기출문제;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 모험가 길드
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i =0 ; i< n; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        int result = 0;
        int count = 0;

        for(int i =0 ; i< n; i++){
            count += 1;
            if(count >= list.get(i)){
                result += 1;
                count = 0;
            }
        }

        System.out.println(result);
    }
}
