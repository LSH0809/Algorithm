package baekjoon.Baekjoon_10866;

import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        StringTokenizer st = null;
        for(int i = 0; i< n; i++){
            st = new StringTokenizer(br.readLine()," ");
            String order = st.nextToken();
            switch (order){
                case "push_front" :{
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "push_back" :{
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                }
                case "pop_front" :{
                    if(!deque.isEmpty()) {
                        sb.append(deque.pollFirst()).append("\n");
                    }else{
                        sb.append(-1).append("\n");
                    }
                    break;
                }
                case "pop_back" :{
                    if(!deque.isEmpty()){
                        sb.append(deque.pollLast()).append("\n");
                    }
                    else {
                        sb.append(-1).append("\n");
                    }
                    break;
                }
                case "size" :{
                    sb.append(deque.size()).append("\n");
                    break;
                }
                case "empty" :{
                    if(!deque.isEmpty()){
                        sb.append(0).append("\n");
                    }else{
                        sb.append(1).append("\n");
                    }
                    break;
                }
                case "front" :{
                    if(!deque.isEmpty()){
                        sb.append(deque.peekFirst()).append("\n");
                    }else{
                        sb.append(-1).append("\n");
                    }
                    break;
                }
                case "back" :{
                    if(!deque.isEmpty()){
                        sb.append(deque.peekLast()).append("\n");
                    }else{
                        sb.append(-1).append("\n");
                    }
                    break;
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}
