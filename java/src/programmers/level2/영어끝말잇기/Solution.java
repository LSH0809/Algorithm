package programmers.level2.영어끝말잇기;

import java.util.*;

public class Solution {

    public int[] solution(int n, String[] words) {
        List<String> arr = new ArrayList<>();
        int[] answer = {};
        int turn = 1;
        String prev = "";
        for (int i = 0; i < words.length; i++) {
            if (i != 0 && words[i].charAt(0) != prev.charAt(prev.length() - 1)) {
                answer = new int[]{i % n + 1, turn};
                break;
            }
            if (arr.contains(words[i])) {
                answer = new int[]{i % n + 1, turn};
                break;
            }
            if ((i + 1) % n == 0) {
                turn++;
            }
            if (i == words.length - 1) {
                answer = new int[]{0, 0};
                break;
            }
            arr.add(words[i]);
            prev = words[i];
        }
        return answer;
    }
}