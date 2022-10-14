package 이것이코딩테스트다.구현.실전문제;

import java.io.*;

// 왕실의 나이트
public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] dx = {-1,1,2,2,1,-1,-2,-2};
        int[] dy = {2,2,1,-1,-2,-2,-1,1};

        String input = br.readLine();
        int col = input.charAt(0) - 'a' + 1;
        int row = Integer.parseInt(String.valueOf(input.charAt(1)));

        int count= 0;

        for(int i = 0; i< 8; i++){
            int next_x = col + dx[i];
            int next_y = row + dy[i];

            if(next_x >=1 && next_x <=8 && next_y >= 1 && next_y <= 8){
                count += 1;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
