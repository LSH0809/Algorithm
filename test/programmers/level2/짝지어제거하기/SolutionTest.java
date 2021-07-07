package programmers.level2.짝지어제거하기;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void solution(){
        Solution solution = new Solution();

        Assert.assertEquals(solution.solution("baabaa"),1);
        Assert.assertEquals(solution.solution("cdcd"),0);
    }

}