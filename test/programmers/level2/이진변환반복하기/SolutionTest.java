package programmers.level2.이진변환반복하기;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();

        String s1 = "110010101001", s2 = "01110", s3 = "1111111";
        int[] result1 = {3, 8}, result2 = {3, 3}, result3 = {4, 1};

        Assert.assertEquals(solution.solution(s1)[0], result1[0]);
        Assert.assertEquals(solution.solution(s1)[1], result1[1]);
        Assert.assertEquals(solution.solution(s2)[0], result2[0]);
        Assert.assertEquals(solution.solution(s2)[1], result2[1]);
        Assert.assertEquals(solution.solution(s3)[0], result3[0]);
        Assert.assertEquals(solution.solution(s3)[1], result3[1]);
    }
}