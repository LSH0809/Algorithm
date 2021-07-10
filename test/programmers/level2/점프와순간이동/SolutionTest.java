package programmers.level2.점프와순간이동;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();
        int n1 = 5, n2 = 6, n3 = 5000;

        Assert.assertEquals(solution.solution(n1), 2);
        Assert.assertEquals(solution.solution(n2), 2);
        Assert.assertEquals(solution.solution(n3), 5);

    }
}