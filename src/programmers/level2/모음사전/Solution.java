package programmers.level2.모음사전;

public class Solution {
    static int[] strIdx = {781, 156,31, 6, 1};
    static String str = "AEIOU";

    public static int solution(String word) {
        int answer = word.length();
        for(int i = 0; i< word.length(); i++){
            int idx = str.indexOf(word.charAt(i));
            answer += strIdx[i] * idx;
        }

        return answer;
    }
}
