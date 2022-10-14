package baekjoon.Baekjoon_9663;

import java.util.*;

import static java.lang.Long.bitCount;

public class Ex implements Comparable<Ex>{
    int a;
    int b;
    public Ex(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Ex o){
        return this.a - o.a;
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Queue<Integer> minHeap = new PriorityQueue<>();
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        Map<Integer,String> map = new HashMap<>();
        map.put(1,map.getOrDefault(1,"2"));
        StringBuffer sb = new StringBuffer("123");
        StringBuffer reverse = sb.reverse();
        reverse.deleteCharAt(1);
        Integer[] arr = {1,2,3};

        Arrays.sort(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        List<Integer> integers = Arrays.asList(arr);

        Stack<Character> stack = new Stack<>();
        String input = "adfsf";
        String s = input.toUpperCase();
        Character.isLetter(s.charAt(1));
        boolean digit = Character.isDigit(2);
        boolean a = s.startsWith("a");
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        Integer.toBinaryString(2);
        int i = bitCount(2);
    }
}
