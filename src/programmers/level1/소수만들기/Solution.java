package programmers.level1.소수만들기;

public class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int temp = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    temp = nums[i] + nums[j] + nums[k];
                    if (check(temp) == true) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public boolean check(int num) {
        int count = 1;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
            if (count >= 3) {
                return false;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
}
