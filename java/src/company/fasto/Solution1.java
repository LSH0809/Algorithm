package company.fasto;

public class Solution1 {
    private static int solution(int b) {
        int answer = 0;
        double a = 0;
        for(int c = b; c < 500000 + 1; c++){

            a = Math.sqrt(Math.pow(c,2) - Math.pow(b,2));

            if(a + b < c){
                break;
            }
            if(a == Math.floor(a) && a > 0){
                if(a <= b && b <= c && a <= c) {
                    answer = c;
                }
                break;
            }
        }

        if(answer == 0){
            answer = -1;
        }

        return answer;
    }
}
/*
a제곱 + b제곱 = c제곱에서 b를 파라미터로 받고
가능한 최소의 c반환

점수
20 / 20
 */

