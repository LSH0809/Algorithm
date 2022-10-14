package baekjoon.Baekjoon_2331;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static int a,p;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        a = Integer.parseInt(st.nextToken());
        p = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        list.add(a);
        int answer = 0;

        while(true){
            int num = list.get(list.size() - 1);

            int temp = 0;

            while(num > 0){
                temp += Math.pow(num % 10, p);
                num /= 10;
            }

            if(!list.contains(temp)) {
                list.add(temp);
            }else{
                answer = list.indexOf(temp);
                break;
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();

        bw.close();
        br.close();
    }
}
