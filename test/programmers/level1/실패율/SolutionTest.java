package programmers.level1.실패율;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();

        int n1 = 5, n2 = 4;
        int[] stages1 = {2, 1, 2, 6, 2, 4, 3, 3}, stages2 = {4, 4, 4, 4, 4};
        int[] result1 = {3, 4, 2, 1, 5}, result2 = {4, 1, 2, 3};

        Assert.assertEquals(solution.solution(n1, stages1)[0], result1[0]);
        Assert.assertEquals(solution.solution(n1, stages1)[1], result1[1]);
        Assert.assertEquals(solution.solution(n1, stages1)[2], result1[2]);
        Assert.assertEquals(solution.solution(n1, stages1)[3], result1[3]);
        Assert.assertEquals(solution.solution(n1, stages1)[4], result1[4]);

        Assert.assertEquals(solution.solution(n2, stages2)[0], result2[0]);
        Assert.assertEquals(solution.solution(n2, stages2)[1], result2[1]);
        Assert.assertEquals(solution.solution(n2, stages2)[2], result2[2]);
        Assert.assertEquals(solution.solution(n2, stages2)[3], result2[3]);

    }
}