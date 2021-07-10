package programmers.level2.카펫;

import org.junit.Assert;
import org.junit.Test;

public class SolutionRefactoringTest {

    @Test
    public void solution() {
        Solution solution = new Solution();

        int brown1 = 10, brown2 = 8, brown3 = 24;
        int yellow1 = 2, yellow2 = 1, yellow3 = 24;
        int[] answer1 = {4, 3}, answer2 = {3, 3}, answer3 = {8, 6};

        Assert.assertEquals(solution.solution(brown1, yellow1)[0], answer1[0]);
        Assert.assertEquals(solution.solution(brown1, yellow1)[1], answer1[1]);

        Assert.assertEquals(solution.solution(brown2, yellow2)[0], answer2[0]);
        Assert.assertEquals(solution.solution(brown2, yellow2)[1], answer2[1]);

        Assert.assertEquals(solution.solution(brown3, yellow3)[0], answer3[0]);
        Assert.assertEquals(solution.solution(brown3, yellow3)[1], answer3[1]);
    }

}