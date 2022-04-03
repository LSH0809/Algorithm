package baekjoon.Baekjoon_1717;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        parent = new int[n + 1];
        for(int i = 1; i< n + 1; i++){
            parent[i] = i;
        }

        for(int i = 0; i< m; i++){
            st = new StringTokenizer(br.readLine()," ");
            int order = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(order == 0){
                union(a,b);
            }else if(order == 1){
                sb.append(isSameParent(a, b) ? "YES" : "NO").append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }

    public static int find(int x){
        if(x == parent[x]){
            return x;
        }
        return parent[x] = find(parent[x]);
    } // x의 부모를 찾는 연산

    public static void union(int x, int y){
        x = find(x);
        y = find(y);

        if(x != y){
            if(x < y){
                parent[y] = x;
            }else{
                parent[x] = y;
            }
        }
    } // y의 부모를 x의 부모로 치환하는 연산( x > y 일 경우, 반대)

    public static boolean isSameParent(int x, int y){
        x = find(x);
        y = find(y);

        if(x == y){
            return true;
        }
        return false;
    }
}
