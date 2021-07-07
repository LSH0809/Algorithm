package programmers.level2.예상대진표;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();

        Assert.assertEquals(solution.solution(8,4,7),3);
    }
}