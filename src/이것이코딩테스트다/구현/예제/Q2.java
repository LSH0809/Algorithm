package 이것이코딩테스트다.구현.예제;

import java.io.*;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0; i< N+1; i++){
            for(int j = 0; j< 60; j++){
                for(int k = 0; k< 60; k++){
                    String compare = i + "" + j + "" + k;
                    if(compare.contains("3")){
                        count += 1;
                    }
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
