package baekjoon.Baekjoon_2800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static String str;
    static Set<String> set;
    static List<String> list;
    static int[] arr;
    static boolean[] visited;
    static Stack<Integer> stack;

    public static void solve(int nowIndex, int length,StringBuffer str){
        if(nowIndex == length){
            set.add(str.toString());
            return;
        }
        if(str.charAt(nowIndex) == '('){
            visited[nowIndex] = true;
            solve(nowIndex+1,length,str);
            visited[nowIndex] = false;
        }
        if(str.charAt(nowIndex) == ')' && visited[arr[nowIndex]]){
            visited[nowIndex] = true;
            solve(nowIndex +1 , length,str);
            visited[nowIndex] = false;
        }else{
            str.append(str.charAt(nowIndex));
            solve(nowIndex+1, length,str);
            str.deleteCharAt(str.length() -1 );
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        set = new HashSet<>();
        arr = new int[input.length()];
        visited = new boolean[input.length()];
        stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i< input.length(); i++){
            if(input.charAt(i) == '('){
                stack.push(i);
            }else if(input.charAt(i) == '('){
                arr[i] = stack.peek();
                arr[stack.peek()] = i;
                stack.pop();
            }
        }
        solve(0,input.length(), sb);
        set.remove(input);
        list = new ArrayList<>(set);
        Collections.sort(list);
        for(String s : list){
            sb.append(s).append("\n");
        }
        System.out.println(sb.toString());
    }
}
