package programmers.level3.여행경로;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution = new Solution();

    String[][] tickets1 = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}}, tickets2 = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
    String[] results1 = {"ICN", "JFK", "HND", "IAD"}, results2 = {"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"};

    @Test
    public void solution() {
        Assert.assertEquals(solution.solution(tickets1),results1[0]);
        Assert.assertEquals(solution.solution(tickets2),results2[0]);
    }
}