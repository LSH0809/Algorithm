package programmers.level1.비밀지도;

import org.junit.Assert;
import org.junit.Test;


public class SolutionRefactoringTest {

    @Test
    public void solution() {
        Solution solution = new Solution();

        int n1 = 5, n2 = 6;
        int[] arr1 = {9, 20, 28, 18, 11}, arr2 = {30, 1, 21, 17, 28};
        int[] arr3 = {46, 33, 33, 22, 31, 50}, arr4 = {27, 56, 19, 14, 14, 10};

        Assert.assertEquals(solution.solution(n1, arr1, arr2), new String[]{"#####", "# # #", "### #", "#  ##", "#####"});
        Assert.assertEquals(solution.solution(n2, arr3, arr4), new String[]{"######", "### #", "## ##", " #### ", " #####", "### # "});
//        테스트 케이스 공백 오류 있음
    }
}