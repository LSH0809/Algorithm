package 이것이코딩테스트다.그리디.유형별기출문제;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

       List<Integer> list = new ArrayList<>();
       for(int i = 0; i< N; i++){
           list.add(sc.nextInt());
       }

        Collections.sort(list);

       int target = 1;

       for(int i = 0; i< N; i++){
           if(target < list.get(i))
               break;
           target += list.get(i);
       }

        System.out.println(target);

    }
}
