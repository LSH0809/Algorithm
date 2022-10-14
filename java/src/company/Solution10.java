package company;

import java.util.Arrays;

class Solution10 {
    public static int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int n = A.length;
        int[] C = new int[n];
        int[] dp = new int[100001];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            C[i] = Math.max(A[i], B[i]);
            dp[C[i]] = 1;
        }

        for (int i = 1; i < dp.length; i++) {
            if (dp[i] != 1) {
                answer = i;
                break;
            }
        }
        return answer;

        // Arrays.sort(C);

        // for(int i = 1; i< C.length + 1; i++){
        //     if(C[i-1] != i){
        //         answer = i;
        //         break;
        //     }
        //     if(i == C.length){
        //         answer = i + 1;
        //         break;
        //     }
        // }
        // return answer;
    }


    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {1, 2};

        System.out.println(solution(a, b));
    }
}
