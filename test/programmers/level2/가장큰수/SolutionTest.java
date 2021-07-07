package programmers.level2.가장큰수;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();
        int[] numbers1 = {6, 10, 2}, numbers2 = {3, 30, 34, 5, 9};

        Assert.assertEquals(solution.solution(numbers1), "6210");
        Assert.assertEquals(solution.solution(numbers2), "9534330");
    }
}