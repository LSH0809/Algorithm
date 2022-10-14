package baekjoon.Baekjoon_12865;

import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] weights = new int[n];
        int[] values = new int[n];
        visited = new boolean[n];
        answer = Integer.MIN_VALUE;
        List<Product> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
//            weights[i] = Integer.parseInt(st.nextToken());
//            values[i] = Integer.parseInt(st.nextToken());
            list.add(new Product(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        list.sort((o1, o2) -> {
            if (o1.weight - o2.weight > 0) {
                return 1;
            } else {
                return -1;
            }
        });

        for (int i = 1; i < n + 1; i++) {
            getCases(n, k, 0, list, i);
        }


        bw.write(String.valueOf(answer));
        bw.flush();

        bw.close();
        br.close();
    }

    private static void getCases(int n, int k, int depth, List<Product> products, int r) {
        if (r == 0) {
            int valueSum = 0;
            int weightSum = 0;
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    valueSum += products.get(i).value;
                    weightSum += products.get(i).weight;
                    if (weightSum > k) {
                        return;
                    }
                }
            }
            answer = Math.max(answer, valueSum);
            return;
        }

        for (int i = depth; i < n; i++) {
            visited[i] = true;
            getCases(n, k, depth + 1, products, r - 1);
            visited[i] = false;
        }
    }

//    private static void getCases(int n, int k, int depth, int[] values, int[] weights, int r) {
//        if (r == 0) {
//            int valueSum = 0;
//            int weightSum = 0;
//            for (int i = 0; i < n; i++) {
//                if (visited[i]) {
//                    valueSum += values[i];
//                    weightSum += weights[i];
//                    if (weightSum > k) {
//                        return;
//                    }
//                }
//            }
//            answer = Math.max(answer, valueSum);
//            return;
//        }
//
//        for (int i = depth; i < n; i++) {
//            visited[i] = true;
//            getCases(n, k, depth + 1, values, weights, r - 1);
//            visited[i] = false;
//        }
//    }

    static class Product {
        int weight, value;

        public Product(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }
}
