package baekjoon.Baekjoon_12015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i< n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        list.add(0);
        for(int i = 0; i< n; i++){
            int value = arr[i];
            if(list.get(list.size()-1) < value){
                list.add(value);
            }else{
                int left = 1;
                int right = list.size() - 1;

                while(left < right){
                    int mid = (left + right) / 2;
                    if(list.get(mid) < value){
                        left = mid + 1;
                    }else{
                        right = mid;
                    }
                }
                list.set(right, value);
            }
        }
        System.out.println(list.size() - 1);
    }
}
