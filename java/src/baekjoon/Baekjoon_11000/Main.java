package baekjoon.Baekjoon_11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class Schedule {
        int s, t;

        public Schedule(int s, int t) {
            this.s = s;
            this.t = t;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        Schedule[] schedules = new Schedule[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            schedules[i] = new Schedule(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(schedules, new Comparator<Schedule>() {
            @Override
            public int compare(Schedule o1, Schedule o2) {
                return o1.s == o2.s ? o1.t - o2.t : o1.s - o2.s;
            }
        });
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(schedules[0].t);

        for (int i = 1; i < N; i++) {
            if (priorityQueue.peek() <= schedules[i].s) {
                priorityQueue.poll();
            }
            priorityQueue.add(schedules[i].t);
        }
        answer = priorityQueue.size();
        System.out.println(answer);
    }
}
