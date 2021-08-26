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

//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//    StringBuffer sb = new StringBuffer();
//
//    int N = Integer.parseInt(st.nextToken());
//    int M = Integer.parseInt(st.nextToken());
//
//    List<String> list = new ArrayList<>();
//    List<String> answer_list = new ArrayList<>();
//
//        for (int i = 0; i < N; i++) {
//        list.add(br.readLine());
//        }
//
//        for (int i = 0; i < M; i++) {
//        String input = br.readLine();
//        if (list.contains(input)) {
//        answer_list.add(input);
//        }
//        }
//
//        Collections.sort(answer_list);
//
//        sb.append(answer_list.size()).append("\n");
//        for (String s : answer_list) {
//        sb.append(s).append("\n");
//        }
//
//        bw.write(sb.toString());
//        bw.flush();
//
//        bw.close();
//        br.close();
