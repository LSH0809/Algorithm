//package programmers.level2.기능개발;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class SolutionTest {
//
//    @Test
//    public void solution() {
//        Solution solution = new Solution();
//
//        int[] progress1 = {93,30,55}, progress2 = {95, 90, 99, 99, 80, 99};
//        int[] speeds1 = {1,30,5}, speeds2 = {1, 1, 1, 1, 1, 1};
//
//        int[] return1 = {2,1};
//        int[] return2 = {1,3,2};
//
//        Assert.assertEquals(solution.solution(progress1,speeds1)[0],return1[0]);
//        Assert.assertEquals(solution.solution(progress1,speeds1)[1],return1[1]);
//        Assert.assertEquals(solution.solution(progress2,speeds2)[0],return2[0]);
//        Assert.assertEquals(solution.solution(progress2,speeds2)[1],return2[1]);
//        Assert.assertEquals(solution.solution(progress2,speeds2)[2],return2[2]);
//    }
//}