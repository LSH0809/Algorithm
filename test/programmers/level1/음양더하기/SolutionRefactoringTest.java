package programmers.level1.음양더하기;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionRefactoringTest {

    @Test
    public void solution() {
        Solution solution = new Solution();
        int[] absolutes1 = {4, 7, 12}, absolutes2 = {1, 2, 3};
        boolean[] signs1 = {true, false, true}, signs2 = {false, false, true};

        Assert.assertEquals(solution.solution(absolutes1, signs1), 9);
        Assert.assertEquals(solution.solution(absolutes2, signs2), 0);
    }
}