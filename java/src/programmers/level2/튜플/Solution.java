package programmers.level2.튜플;

public class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        s = s.replaceAll("\\{","[");
        s = s.replaceAll("}","]");
        System.out.println(s);

        return answer;
    }
}
