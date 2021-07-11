package programmers.level2.스킬트리;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();

        String skill= "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        Assert.assertEquals(solution.solution(skill,skill_trees),2);
    }
}