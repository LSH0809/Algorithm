package programmers.weekly_challenge;

import org.junit.Assert;
import org.junit.Test;
import programmers.weekly_challenge.week01.Solution;

public class SolutionTest {
    int price = 3;
    int money = 20;
    int count = 4;
    long result = 10;

    @Test
    public void solution() {
        Solution solution = new Solution();

        Assert.assertEquals(solution.solution(price, money, count), result);
    }
}