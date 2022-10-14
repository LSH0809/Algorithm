package programmers.level2.카펫;

public class Solution {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total_count = brown + yellow;
        for (int i = 3; i < brown; i++) {
            for (int j = 3; j < brown; j++) {
                if (total_count == i * j && i >= j) {
                    if (yellow == (i - 2) * (j - 2)) {
                        answer[0] = i;
                        answer[1] = j;
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
