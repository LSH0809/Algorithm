package baekjoon.Baekjoon_1992;

import java.io.*;

public class Main {
    static int[][] arr;
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        for(int i = 0; i< n; i++){
            String str = br.readLine();
            for(int j = 0; j< n; j++){
                arr[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }

        quadTree(0,0,n);

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();

    }

    private static void quadTree(int x, int y, int size){
        if(isPossible(x,y,size)){
            sb.append(arr[x][y]);
            return;
        }

        int newSize = size / 2;

        sb.append('(');

        quadTree(x, y, newSize);
        quadTree(x + newSize, y, newSize);
        quadTree(x, y + newSize, newSize);
        quadTree(x + newSize, y + newSize, newSize);

        sb.append(')');
    }

    private static boolean isPossible(int x, int y, int size){
        int tempValue = arr[x][y];

        for(int i = x; i < x + size; i++){
            for(int j = y; j< y + size; j++){
                if(tempValue != arr[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
