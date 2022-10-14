package programmers.level2.더맵게;


import java.util.PriorityQueue;

public class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int answer = 0;

        for (int s : scoville) {
            priorityQueue.add(s);
        }

        while (priorityQueue.peek() <= K) {
            if (priorityQueue.size() == 1) {
                return -1;
            } else {
                int a = priorityQueue.poll();
                int b = priorityQueue.poll();

                int value = a + 2 * b;

                priorityQueue.offer(value);
                answer++;
            }
        }
        return answer;
    }
}
