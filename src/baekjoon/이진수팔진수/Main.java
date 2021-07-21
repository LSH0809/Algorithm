package baekjoon.이진수팔진수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();

        int len = input.length();

        if (len % 3 == 1) {
            System.out.print(input.charAt(0));
        } else if (len % 3 == 2) {
            System.out.print((input.charAt(0) - '0') * 2 + input.charAt(1) - '0');
        }
        for(int i = len % 3; i < len; i+=3){
            System.out.print((input.charAt(i) - '0')*4 + (input.charAt(i + 1) - '0') * 2 + (input.charAt(i+2) - '0'));
        }
    }
}
