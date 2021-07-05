package programmers.level1.내적;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();

        int[] a1 = {1, 2, 3, 4}, a2 = {-1, 0, 1};
        int[] b1 = {-3, -1, 0, 2}, b2 = {1, 0, -1};

        Assert.assertEquals(solution.solution(a1, b1), 3);
        Assert.assertEquals(solution.solution(a2, b2), -2);
    }
}