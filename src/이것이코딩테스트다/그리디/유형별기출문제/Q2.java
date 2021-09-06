package 이것이코딩테스트다.그리디.유형별기출문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        long result = input.charAt(0) - '0'; // 첫 번째 문자를 숫자로 변경한 값을 대입

        for(int i = 1; i< input.length(); i++){
            int num = input.charAt(i) - '0';
            if(num <= 1 || result <=1){
                result += num;
            }else{
                result *= num;
            }
        }
        System.out.println(result);
    }
}
