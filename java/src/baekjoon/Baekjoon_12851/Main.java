package baekjoon.Baekjoon_12851;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static int[] arr;
    static int[] time;
    static int count = 0;
    static int minTime = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        time = new int[100001];
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        solve(n,k);

        if (n >= k) {
            System.out.println(n-k);
            System.out.println(1);
            return;
        }
        System.out.println(minTime);
        System.out.println(count);
    }

    private static void solve(int n,int k){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        time[n] = 1;

        while(!queue.isEmpty()){
            int poll = queue.poll();
            if(time[poll] > minTime){
                return;
            }else{
                int next;
                for(int i = 0; i< 3; i++){
                    if(i == 0){
                        next = poll - 1;
                    }else if(i == 1){
                        next = poll + 1;
                    }else{
                        next = poll * 2;
                    }
                    if(next > 100000 || next < 0){
                        continue;
                    }

                    if(next == k){
                        minTime = time[poll];
                        count += 1;
                    }

                    if(time[next] == 0){
                        queue.offer(next);
                        time[next] = time[poll] + 1;
                    }
                }
            }
        }
    }
}
