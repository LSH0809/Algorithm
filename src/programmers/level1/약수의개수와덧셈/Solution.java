package programmers.level1.약수의개수와덧셈;

public class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int temp = check(i);

            if (temp % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }

    public int check(int number) {
        int result = 1;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result++;
            }
        }
        return result;
    }
}
