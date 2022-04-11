package baekjoon.Baekjoon_1389;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static final int INF = 987654321;

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n+1][n+1];

        for(int i = 0; i< n + 1; i++){
            for(int j = 0; j < n + 1; j++){
                arr[i][j] = INF;
                if(i == j){
                    arr[i][j] = 0;
                }
            }
        }

        for(int i = 0; i< m; i++){
            st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = 1;
            arr[y][x] = 1;
        }

        for(int k = 1; k< n + 1; k++){
            for(int i = 1; i < n + 1; i++){
                for(int j = 1; j< n + 1; j++){
                    if(arr[i][j] > arr[i][k] + arr[k][j]){
                        arr[i][j] = arr[i][k] + arr[k][j];
                    }
                }
            }
        }

        int minValue = INF;
        int answerIdx = -1;
        for(int i = 1; i< n + 1; i++){
            int tempValue = 0;
            for(int j = 1; j < n + 1; j++){
                tempValue += arr[i][j];
            }
            if(minValue > tempValue){
                minValue = tempValue;
                answerIdx = i;
            }
        }

        bw.write(answerIdx + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
