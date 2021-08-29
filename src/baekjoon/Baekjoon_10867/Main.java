package baekjoon.Baekjoon_10867;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = null;

        Set<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            set.add(Integer.valueOf(st.nextToken()));
        }
        int[] arr = new int[set.size()];
        Iterator iter = set.iterator();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) iter.next();
        }

        Arrays.sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
