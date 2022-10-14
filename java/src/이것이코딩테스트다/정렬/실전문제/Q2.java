package 이것이코딩테스트다.정렬.실전문제;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//위에서 아래로
public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        list.sort(Collections.reverseOrder());

        String s = list.toString();

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
