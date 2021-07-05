package programmers.level1.내적;

public class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int idx = 0;
        while (true) {
            if (idx == a.length) {
                break;
            }
            answer += (a[idx] * b[idx]);
            idx++;
        }
        return answer;
    }
}
