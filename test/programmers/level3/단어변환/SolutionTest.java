package programmers.level3.단어변환;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution = new Solution();

    String begin1 = "hit", begin2 = "hit";
    String target1 = "cog", target2 = "cog";
    String[] words1 = {"hot", "dot", "dog", "lot", "log", "cog"}, words2 = {"hot", "dot", "dog", "lot", "log"};

    @Test
    public void solution() {
        Assert.assertEquals(solution.solution(begin1, target1, words1), 4);
        Assert.assertEquals(solution.solution(begin2, target2, words2), 0);
    }
}