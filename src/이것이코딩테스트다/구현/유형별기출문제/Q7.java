package 이것이코딩테스트다.구현.유형별기출문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 럭키 스트레이트
public class Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int before = 0;
        int after = 0;
        for(int i =0 ; i< input.length(); i++){
            if(i < input.length()/2){
                before += Integer.parseInt(String.valueOf(input.charAt(i)));
            }else{
                after += Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }

        if(before == after){
            System.out.println("LUCKY");
        }else{
            System.out.println("READY");
        }
    }
}
