package programmers.level1.폰켓몬;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();

        int[] nums1 = {3, 1, 2, 3}, nums2 = {3, 3, 3, 2, 2, 4}, nums3 = {3, 3, 3, 2, 2, 2};

        Assert.assertEquals(solution.solution(nums1), 2);
        Assert.assertEquals(solution.solution(nums2), 3);
        Assert.assertEquals(solution.solution(nums3), 2);
    }
}