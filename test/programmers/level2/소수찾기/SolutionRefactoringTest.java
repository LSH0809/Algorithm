package programmers.level2.소수찾기;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionRefactoringTest {

    @Test
    public void solution() {
        Solution solution = new Solution();

        Assert.assertEquals(solution.solution("17"),3);
        Assert.assertEquals(solution.solution("011"),2);
    }
}