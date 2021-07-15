package programmers.level2.더맵게;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();

        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;

        Assert.assertEquals(solution.solution(scoville, k), 2);
    }
}