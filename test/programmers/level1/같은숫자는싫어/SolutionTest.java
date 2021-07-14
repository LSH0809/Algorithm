package programmers.level1.같은숫자는싫어;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        Solution solution = new Solution();

        int[] arr1 = {1,1,3,3,0,1,1}, arr2 = {4,4,4,3,3};
        int[] answer1 = {1,3,0,1}, answer2 = {4,3};
        Assert.assertEquals(solution.solution(arr1)[0],answer1[0]);
        Assert.assertEquals(solution.solution(arr1)[1],answer1[1]);
        Assert.assertEquals(solution.solution(arr1)[2],answer1[2]);
        Assert.assertEquals(solution.solution(arr1)[3],answer1[3]);

        Assert.assertEquals(solution.solution(arr2)[0],answer2[0]);
        Assert.assertEquals(solution.solution(arr2)[1],answer2[1]);



    }
}