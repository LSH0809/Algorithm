package baekjoon.Baekjoon_11004;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();
        for(int i =0 ; i< n; i++) list.add(Integer.parseInt(st.nextToken()));

        Collections.sort(list);

        bw.write(Integer.toString(list.get(k-1)) + '\n');
        bw.flush();
    }
}
