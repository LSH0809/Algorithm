package programmers.level2.튜플;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {

        Solution solution = new Solution();

        String s1 = "{{2},{2,1},{2,1,3},{2,1,3,4}}",s2 = "{{1,2,3},{2,1},{1,2,4,3},{2}}", s3 = "{{20,111},{111}}", s4 = "{{123}}", s5 = "{{4,2,3},{3},{2,3,4,1},{2,3}}";

        int[] result1 = {2,1,3,4};

        Assert.assertEquals(solution.solution(s1)[0],result1[0]);
        Assert.assertEquals(solution.solution(s1)[1],result1[1]);
        Assert.assertEquals(solution.solution(s1)[2],result1[2]);
        Assert.assertEquals(solution.solution(s1)[3],result1[3]);
    }
}