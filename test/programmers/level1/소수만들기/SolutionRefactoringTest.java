package programmers.level1.소수만들기;

import org.junit.Assert;
import org.junit.Test;

public class SolutionRefactoringTest {

    @Test
    public void solution() {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 4}, nums2 = {1, 2, 7, 6, 4};

        Assert.assertEquals(solution.solution(nums1), 1);
        Assert.assertEquals(solution.solution(nums2), 4);
    }

}