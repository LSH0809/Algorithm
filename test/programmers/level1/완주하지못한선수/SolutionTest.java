package programmers.level1.완주하지못한선수;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};
        Assert.assertEquals(solution.solution(participant1,completion1),"leo");
        Assert.assertEquals(solution.solution(participant2,completion2),"vinko");
        Assert.assertEquals(solution.solution(participant3,completion3),"mislav");
    }
}