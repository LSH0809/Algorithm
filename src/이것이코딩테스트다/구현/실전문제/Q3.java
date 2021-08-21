package 이것이코딩테스트다.구현.실전문제;

import java.io.*;
import java.util.StringTokenizer;

public class Q3 {
    // 게임개발

//    public static int[][] map = new int[50][50];
//    public static int[][] dp = new int[50][50];
//
//    public static int dx[] = {-1,0,1,0};
//    public static int dy[] = {0,1,0,-1};
//
//    public static int N,M,x,y,direction;
//    public static void turn_left(){
//        direction -= 1;
//        if(direction == -1)
//            direction = 3;
//    }
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        N = Integer.parseInt(st.nextToken());
//        M = Integer.parseInt(st.nextToken());
//
//        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
//        x = Integer.parseInt(str.nextToken());
//        y = Integer.parseInt(str.nextToken());
//        direction = Integer.parseInt(str.nextToken());
//
//
//        dp[x][y] = 1;
//        int count = 1;
//        int turn_time = 0;
//
//        for(int i = 0; i< N; i++){
//            String line = br.readLine();
//            StringTokenizer strg = new StringTokenizer(line, " ");
//            for(int j = 0; j< M; j++){
//                map[i][j] = Integer.parseInt(strg.nextToken());
//            }
//        }
//
//
//        while(true){
//            turn_left();
//            int nx = x + dx[direction];
//            int ny = y + dy[direction];
//
//            if(dp[nx][ny] == 0 && map[nx][ny] == 0){
//                dp[nx][ny] = 1;
//                x = nx;
//                y = ny;
//                count += 1;
//                turn_time = 0;
//            }else{
//                turn_time += 1;
//
//                if(turn_time == 4){
//                    nx = x - dx[direction];
//                    ny = y - dy[direction];
//
//                    if(map[nx][ny] == 0){
//                        x = nx;
//                        y = ny;
//                    }else{
//                        break;
//                    }
//                    turn_time = 0;
//                }
//            }
//
//        }
//
//
//        bw.write(String.valueOf(count));
//        bw.flush();
//        bw.close();
//    }


    public static void main(String[] args) {

    }
}
