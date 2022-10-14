package baekjoon.Baekjoon_12904;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer(br.readLine());
        StringBuffer t = new StringBuffer(br.readLine());

        while(s.length() != t.length()){
            char c = t.charAt(t.length() - 1);
            t.deleteCharAt(t.length()-1);
            if(c == 'B'){
                t.reverse();
            }
        }
        if(t.toString().equals(s.toString())){
            System.out.println(1);
        }else
            System.out.println(0);
    }
}
