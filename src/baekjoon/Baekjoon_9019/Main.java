package baekjoon.Baekjoon_9019;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static String answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            visited = new boolean[100001];
            sovle(a, b);
            bw.write(answer + "\n");
            answer = "";
        }
        bw.flush();

        bw.close();
        br.close();
    }

    private static void sovle(int a, int b) {
        Queue<Node> queue = new LinkedList<>();
        visited[a] = true;
        queue.add(new Node(a, ""));

        while (!queue.isEmpty()) {
            Node now = queue.poll();
            visited[now.number] = true;
            if (now.number == b) {
                answer = now.order;
                return;
            }

            if (!visited[now.doD()]) {
                queue.add(new Node(now.doD(), now.order + "D"));
                visited[now.doD()] = true;
            }
            if (!visited[now.doL()]) {
                queue.add(new Node(now.doL(), now.order + "L"));
                visited[now.doL()] = true;
            }
            if (!visited[now.doS()]) {
                queue.add(new Node(now.doS(), now.order + "S"));
                visited[now.doS()] = true;
            }
            if (!visited[now.doR()]) {
                queue.add(new Node(now.doR(), now.order + "R"));
                visited[now.doR()] = true;
            }
        }
    }

    static class Node {
        int number;
        String order;

        public Node(int number, String order) {
            this.number = number;
            this.order = order;
        }

        public int doD() {
            return (this.number * 2) % 10000;
        }

        public int doS() {
            return this.number == 0 ? 9999 : this.number - 1;
        }

        public int doL() {
            return this.number % 1000 * 10 + this.number / 1000;
        }

        public int doR() {
            return this.number % 10 * 1000 + this.number / 10;
        }
    }
}
