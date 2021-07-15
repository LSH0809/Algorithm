package programmers.level2.뉴스클러스터;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();

        String str1 = "FRANCE",str2 = "handshake", str3 = "aa1+aa2", str4 = "E=M*C^2";
        String compare1 = "french", compare2 = "shake hands", compare3 = "AAAA12", compare4 = "e=m*c^2";

        Assert.assertEquals(solution.solution(str1,compare1),16384);
        Assert.assertEquals(solution.solution(str2,compare2),65536);
        Assert.assertEquals(solution.solution(str3,compare3),43690);
        Assert.assertEquals(solution.solution(str4,compare4),65536);

    }
}