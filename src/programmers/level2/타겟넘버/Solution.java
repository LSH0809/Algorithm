package programmers.level2.타겟넘버;

public class Solution {
    static int count;
    
    public int solution(int[] numbers, int target) {
        count = 0;
        solve(numbers, target, 0,0);
        
        return count;
    }
    
    private static void solve(int[] numbers, int target, int sum, int idx){
        if(numbers.length == idx){
            if(sum == target){
                count += 1;
            }
            return;
        }
        int plusValue = sum + numbers[idx];
        int minusValue = sum - numbers[idx];
        solve(numbers, target, plusValue , idx + 1);
        solve(numbers, target, minusValue , idx + 1);
    }
}
