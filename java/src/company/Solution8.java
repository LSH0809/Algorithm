package company;

class Solution8 {
    static int answer;

    public static int solution(int[] gold_prices) {
        answer = 0;
        int value = 0;
        int now = 0;

        solve(0, gold_prices, 0, 0, -1, -1);

        return answer;
    }

    private static void solve(int idx, int[] gold_prices, int profit, int now, int buyIdx, int sellIdx) {
        if (idx == gold_prices.length) {
//            System.out.println("check: " + profit);
//            System.out.println(profit);
            answer = Math.max(answer, profit);
            return;
        }
//        System.out.println(profit);
        if (idx == 0) { // 처음일 때
            solve(idx + 1, gold_prices, profit, now, buyIdx, sellIdx); // 그냥 넘어가걱나
            solve(idx + 1, gold_prices, profit, now + 1, 0, sellIdx); // 구매하거나
        } else {// 처음이 아닐 때
            // 가지고 있을 때, 안가지고 있을 때,
            if (now == 1) {
                solve(idx + 1, gold_prices, profit, now, buyIdx, sellIdx); //아무것도 안함
                if (idx - buyIdx > 1) {
                    solve(idx + 1, gold_prices, profit + gold_prices[idx] - gold_prices[buyIdx], now - 1, -1, idx);// 판매
                }
            } else if (now == 0) {
                solve(idx + 1, gold_prices, profit, now, buyIdx, sellIdx); // 아무것도 안함
                if (idx - sellIdx > 1) {
                    solve(idx + 1, gold_prices, profit, now + 1, idx, sellIdx); // 구매하거나
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] gold1 = {2, 5, 1, 3, 4};
        int[] gold2 = {7, 2, 5, 6, 1, 4, 2, 8};

        System.out.println("answer : " + solution(gold1));
        System.out.println("answer : " + solution(gold2));

    }
}

    /*public static int solution(int[] gold_prices) {
        int answer = -1;
        int value = 0;
        int now = 0;
        int[] dp = new int[gold_prices.length];
        int[] rdp = new int[gold_prices.length];

        dp[0] = gold_prices[0]; // 첫날 삼
        rdp[0] = 0; //첫 날 안삼

        for(int i = 1; i< gold_prices.length; i++){
            dp[i] = Math.max(dp[i-1], gold_prices[i] - gold_prices[i -1]);
        }

        for(int i = 1; i< gold_prices.length; i++){
            rdp[i] = Math.max(rdp[i-1], gold_prices[i] - gold_prices[i -1]);
        }

        System.out.println(Math.max(rdp[gold_prices.length - 1], dp[gold_prices.length - 1]));
        return answer;
    }*/