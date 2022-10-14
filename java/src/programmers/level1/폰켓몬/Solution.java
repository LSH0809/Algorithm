package programmers.level1.폰켓몬;

import java.util.*;

public class Solution {
    public int solution(int[] nums) {
        int need = nums.length / 2;
        Integer[] temp_arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp_arr[i] = nums[i];
        }

        Set<Integer> nums_set = new HashSet<>(Arrays.asList(temp_arr));

        if (nums_set.size() > need) {
            return need;
        } else {
            return nums_set.size();
        }
    }
}
