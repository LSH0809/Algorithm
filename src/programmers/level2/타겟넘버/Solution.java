package programmers.level2.타겟넘버;

public class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, target, 0, 0);

        return answer;
    }

    public int dfs(int[] numbers, int target, int sum, int index) {
        int result = 0;

        if (index >= numbers.length) {
            if (target == sum) {
                return 1;
            } else {
                return 0;
            }
        }

        result += dfs(numbers, target, sum + numbers[index], index + 1);
        result += dfs(numbers, target, sum - numbers[index], index + 1);

        return result;
    }
}
