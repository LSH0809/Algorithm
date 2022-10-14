package baekjoon.Baekjoon_1764;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        for(int i =0 ; i<N; i++){
            set.add(br.readLine());
        }

        for(int i = 0; i< M; i++){
            String temp = br.readLine();
            if(set.contains(temp)){
                list.add(temp);
            }
        }

        Collections.sort(list);

        sb.append(list.size()).append("\n");
        for(int i = 0; i< list.size(); i++){
            sb.append(list.get(i)).append("\n");
        }

        System.out.println(sb.toString());
    }
}
