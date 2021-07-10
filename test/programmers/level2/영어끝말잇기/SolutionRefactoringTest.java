package programmers.level2.영어끝말잇기;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionRefactoringTest {

    Solution solution = new Solution();

    @Test
    public void solution() {
        int n1 = 3, n2 = 5, n3 = 2;

        String[] words1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        String[] words2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"};

        Assert.assertEquals(solution.solution(n1, words1)[0], 3);
        Assert.assertEquals(solution.solution(n1, words1)[1], 3);

        Assert.assertEquals(solution.solution(n2, words2)[0], 0);
        Assert.assertEquals(solution.solution(n2, words2)[1], 0);

        Assert.assertEquals(solution.solution(n3, words3)[0], 1);
        Assert.assertEquals(solution.solution(n3, words3)[1], 3);
    }
}