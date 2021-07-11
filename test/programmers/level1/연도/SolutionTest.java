package programmers.level1.연도;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();

        int a = 5, b = 24;

        Assert.assertEquals(solution.solution(a,b),"TUE");
    }
}