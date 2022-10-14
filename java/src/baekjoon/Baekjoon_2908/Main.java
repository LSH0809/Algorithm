package baekjoon.Baekjoon_2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuffer sb1 = new StringBuffer(st.nextToken());
        sb1 = sb1.reverse();
        StringBuffer sb2 = new StringBuffer(st.nextToken());
        sb2 = sb2.reverse();

        if(Integer.parseInt(sb1.toString()) > Integer.parseInt(sb2.toString())){
            System.out.println(sb1);
        }else{
            System.out.println(sb2);
        }
    }
}
