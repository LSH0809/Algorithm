package programmers.level2.타겟넘버;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionRefactoringTest {

    Solution solution = new Solution();

    @Test
    public void solution() {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        Assert.assertEquals(solution.solution(numbers, target), 5);
    }
}