package baekjoon.Baekjoon_11652;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Integer maxValue = 0;
        long maxKey = 0;
        Map<Long,Integer> map = new HashMap<>();

        for(int i = 0; i< n; i++){
            long num = Long.parseLong(br.readLine());
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        for(Long key: map.keySet()){
            if(maxValue < map.get(key)){
                maxValue = map.get(key);
                maxKey = key;
            }else if(maxValue.equals(map.get(key))){
                maxKey = Math.min(maxKey,key);
                maxValue = map.get(key);
            }
        }

        bw.write(String.valueOf(maxKey));
        bw.flush();
        bw.close();
        br.close();
    }
}
