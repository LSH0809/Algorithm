package 이것이코딩테스트다.그리디.유형별기출문제;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int count0 = 0;
        int count1 = 0;

        if(str.charAt(0) == '1'){
            count0 += 1;
        }else{
            count1 += 1;
        }

        for(int i = 0; i< str.length() - 1; i++){
            if(str.charAt(i) != str.charAt(i+1)){
                if(str.charAt(i+1) == '1')
                    count0 += 1;
                else
                    count1 += 1;
            }
        }
        System.out.println(Math.min(count0,count1));
    }
}
