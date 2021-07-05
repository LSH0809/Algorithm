package programmers.level1.체육복;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        int n1 = 5, n2 = 5, n3 = 3;
        int[] lost1 = {2,4}, lost2 = {2,4}, lost3 = {3};
        int[] reserve1 = {1,3,5}, reserve2 = {3}, reserve3 = {1};

        Solution solution = new Solution();
        Assert.assertEquals(solution.solution(n1,lost1,reserve1),5);
        Assert.assertEquals(solution.solution(n2,lost2,reserve2),4);
        Assert.assertEquals(solution.solution(n3,lost3,reserve3),2);

    }
}