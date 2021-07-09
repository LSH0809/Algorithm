package programmers.level1.다트게임;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();

        String dartResult1 = "1S2D*3T", dartResult2 = "1D2S#10S", dartResult3 = "1D2S0T",
                dartResult4 = "1S*2T*3S", dartResult5 = "1D#2S*3S", dartResult6 = "1T2D3D#",
                dartResult7 = "1D2S3T*";

        Assert.assertEquals(solution.solution(dartResult1), 37);
        Assert.assertEquals(solution.solution(dartResult2), 9);
        Assert.assertEquals(solution.solution(dartResult3), 3);
        Assert.assertEquals(solution.solution(dartResult4), 23);
        Assert.assertEquals(solution.solution(dartResult5), 5);
        Assert.assertEquals(solution.solution(dartResult6), -4);
        Assert.assertEquals(solution.solution(dartResult7), 59);
    }
}