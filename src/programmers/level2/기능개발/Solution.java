//package programmers.level2.기능개발;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class Solution {
//    public int[] solution(int[] progresses, int[] speeds) {
//        List<Integer> answer = new ArrayList<>();
//        Queue<Integer> queue1 = new LinkedList<>();
//        Queue<Integer> queue2 = new LinkedList<>();
//        int n = 0;
//
//        for (int i = 0; i < progresses.length; i++) {
//            queue1.offer(progresses[i]);
//            queue2.offer(speeds[i]);
//        }
//
//        while (!queue1.isEmpty()) {
//            n++;
//            int temp = check(n, queue1, queue2);
//            if (temp != 0) {
//                answer.add(temp);
//            }
//        }
//
//        int[] result = new int[answer.size()];
//
//        for (int i = 0; i < result.length; i++) {
//            result[i] = answer.get(i);
//        }
//
//        return result;
//    }
//
//    public static int check(int n, Queue<Integer> queue1, Queue<Integer> queue2) {
//        int count = 0;
//
//        while (!queue1.isEmpty()) {
//            if ((queue1.peek() + queue2.peek() * n) >= 100) {
//                queue1.poll();
//                queue2.poll();
//                count++;
//            } else {
//                break;
//            }
//        }
//
//        return count;
//    }
//}
