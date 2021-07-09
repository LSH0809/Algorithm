package programmers.level1.약수의개수와덧셈;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();

        int left1 = 13, left2 = 24;
        int right1 = 17, right2 = 27;

        Assert.assertEquals(solution.solution(left1,right1),43);
        Assert.assertEquals(solution.solution(left2,right2),52);
    }
}