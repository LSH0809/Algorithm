package programmers.weekly_challenge.week01;

public class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;

        for (int i = price; i <= price * count; i = i + price) {
            sum += i;
        }

        if (sum <= money) {
            return 0;
        }
        return sum - money;
    }
}
