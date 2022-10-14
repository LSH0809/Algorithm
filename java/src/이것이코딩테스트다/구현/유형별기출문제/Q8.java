package 이것이코딩테스트다.구현.유형별기출문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 문자열 재정렬
public class Q8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Character> list = new ArrayList<>();
        int number = 0;
        String input = br.readLine();
        for(int i =0 ; i< input.length(); i++){
            if(Character.isLetter(input.charAt(i))){
                list.add(input.charAt(i));
            }else{
                number += input.charAt(i) - '0';
            }
        }

        Collections.sort(list);

        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i));
        }
        if(number != 0){
            System.out.println(number);
        }
    }
}
