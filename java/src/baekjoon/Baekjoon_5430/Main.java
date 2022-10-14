package baekjoon.Baekjoon_5430;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] orders = br.readLine().split("");
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
            ArrayDeque<Integer> deque = new ArrayDeque<>();
            for (int i = 0; i < n; i++) {
                deque.offer(Integer.parseInt(st.nextToken()));
            }

            bw.write(solve(deque, orders));
            bw.flush();

        }
        bw.close();
        br.close();
    }

    private static String solve(ArrayDeque<Integer> deque, String[] orders) {
        boolean isRightFlag = false;
        StringBuffer sb = new StringBuffer();

        for (String order : orders) {
            switch (order) {
                case "R": {
                    isRightFlag = !isRightFlag;
                    break;
                }

                case "D": {
                    if (deque.size() == 0) {
                        return "error\n";
                    } else {
                        if (isRightFlag) {
                            deque.removeLast();
                        } else {
                            deque.removeFirst();
                        }
                    }
                    break;
                }
                default:
                    break;
            }
        }

        sb.append("[");

        if (isRightFlag) {
            while (deque.size() > 1) {
                sb.append(deque.pollLast()).append(",");
            }
        }// 오른족에서부터 값 빼기
        else {
            while (deque.size() > 1) {
                sb.append(deque.pollFirst()).append(",");
            }
        }
        if (deque.size() != 0) {
            sb.append(deque.poll());
        }
        sb.append("]");
        sb.append("\n");

        return sb.toString();
    }
}