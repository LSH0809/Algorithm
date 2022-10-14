package baekjoon.Baekjoon_2920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String answer = "ascending";
        int[] str_int = new int[str.length];
        for(int i = 0 ; i< str_int.length; i++){
            str_int[i] = Integer.parseInt(str[i]);
        }

        for(int i =0 ; i< str_int.length - 1; i++){
            if(str_int[i+1] - str_int[i] == 1){
                answer = "ascending";
            }else if(str_int[i+1] - str_int[i] == -1){
                answer = "descending";
            }else{
                answer = "mixed";
                break;
            }
        }
        System.out.println(answer);
    }
}
