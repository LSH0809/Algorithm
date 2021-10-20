package baekjoon.Baekjoon_2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int num = 0;
        int totalNum = 1;
        while(true){
            if(N == 1){
                System.out.println(1);
                return;
            }
            if(N <= totalNum){
                break;
            }
            num += 6;
            totalNum += num;
            count += 1;
        }
        System.out.println(count);
    }
}
