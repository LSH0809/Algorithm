package baekjoon.Baekjoon_1068;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static ArrayList<Integer>[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        list = new ArrayList[n];
        for(int i = 0; i < n; i++){
            list[i] = new ArrayList<>();
        }
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int root = -1;
        for(int i = 0; i< n; i++){
            int value = Integer.parseInt(st.nextToken());
            if(value == -1){
                root = i;
                continue;
            }
            list[value].add(i); // value번 노드의 부모 노드 는 i 이다.
        }

        int remove = Integer.parseInt(br.readLine());

        removeNode(remove);

        if(remove == root){
            bw.write("0");
        }else{
            bw.write(findLeafNode(root));
        }
        bw.flush();

        bw.close();
        br.close();
    }

    private static void removeNode(int node){
        if(list[node].size() != 0){
            int size = list[node].size();
            while(size > 0){
                int child = list[node].get(--size);
                removeNode(child);
            }
        }

        for(int i = 0; i< n; i++){
            if(list[i].contains(node)){ //
                for(int j = 0; j< list[i].size(); j++){
                    if(list[i].get(j) == node){
                        list[i].remove(j);
                    }
                }
            }
        }
    }

    private static String findLeafNode(int root){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(root);
        int count = 0;

        while(!queue.isEmpty()){
            int node = queue.poll();
            if(list[node].size() == 0){
                count += 1; // 노드의 자식 노드가 없는 경우이니까 size() 메소드의 반환값이 0일 것이다.
                continue;
            }
            for(int newNode : list[node]){
                queue.offer(newNode);
            }
        }
        return String.valueOf(count);
    }
}
