package programmers.level2.프린터;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();
        int[] priorities1 = {2, 1, 3, 2}, priorities2 = {1, 1, 9, 1, 1, 1};
        int location1 = 2, location2 = 0;

        Assert.assertEquals(solution.solution(priorities1, location1), 1);
        Assert.assertEquals(solution.solution(priorities2, location2), 5);
    }
}