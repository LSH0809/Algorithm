package programmers.level1.예산;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();

        int[] d1 = {1, 3, 2, 5, 4}, d2 = {2, 2, 3, 3};
        int budget1 = 9, budget2 = 10;

        Assert.assertEquals(solution.solution(d1, budget1), 3);
        Assert.assertEquals(solution.solution(d2, budget2), 4);
    }
}