package baekjoon.Baekjoon_10610;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String N = br.readLine();
        int tempSum = 0;
        Integer[] arr = new Integer[N.length()];
        if (N.contains("0")) {
            for (int i = 0; i < N.length(); i++) {
                int tempValue = Integer.parseInt(String.valueOf(N.charAt(i)));
                tempSum += tempValue;
                arr[i] = tempValue;
            }
            if (tempSum % 3 == 0) {
                Arrays.sort(arr, Collections.reverseOrder());
                for (int i = 0; i < arr.length; i++) {
                    sb.append(arr[i]);
                }
            } else {
                sb.append(-1);
            }
        } else {
            sb.append(-1);
        }
        System.out.println(sb);
    }
}
