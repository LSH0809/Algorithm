package baekjoon.Baekjoon_1662;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static String[] input;
    static int[] rightIdx;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine().split("");
        Stack<Integer> stack = new Stack<>();
        rightIdx = new int[51];

        for(int i =0 ; i< input.length; i++){
            String nowCharacter = input[i];
            if(nowCharacter.equals("("))
                stack.add(i); // '('의 위치
            if(nowCharacter.equals(")"))
                rightIdx[stack.pop()] = i; // rightIdx 배열에 ')'의 위치를 할당한다.
        }

        System.out.println(solve(0,input.length));
    }

    public static int solve(int start, int end){
        int len = 0;
        for(int i = start; i< end; i++){
            if(input[i].equals("(")){
                len += Integer.parseInt(input[i-1]) * solve(i +1, rightIdx[i]) - 1;
                i = rightIdx[i];
            }else
                len += 1;
        }
        return len;
    }
}
