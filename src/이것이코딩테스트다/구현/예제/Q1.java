package 이것이코딩테스트다.구현.예제;

import java.io.*;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] plans = br.readLine().split(" ");
        int x = 1, y = 1;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] move = {'L','R','U','D'};
        int nx = -1, ny = -1;
        for(int i = 0; i< plans.length; i++){
            char now = plans[i].charAt(0);

            for(int j = 0; j< 4; j++){
                if(now == move[j]){
                    nx = dx[j] + x ;
                    ny = dy[j] + y;
                }
            }

            if(nx < 1 || nx > N || ny < 1 || ny > N){
                continue;
            }
            x = nx;
            y = ny;
        }
        bw.write(x + " " + y);
        bw.flush();
        bw.close();
    }
}
