package programmers.level2.일이사나라의숫자;

public class Solution {
    public String solution(int n) {
        String answer = "";
        String[] arr = {"4","1","2"};
        int temp = 0;
        while(n > 0){
            temp = n % 3;
            n /= 3;
            if(temp == 0)
                n -= 1;
            answer = arr[temp] + answer;
        }
        return answer;
    }
}

//    public String solution(int n) {
//        String answer = "";
//        int temp;
//
//        while (n > 0) {
//            temp = n % 3;
//            n /= 3;
//
//            if (temp == 0) {
//                n -= 1;
//                temp = 4;
//            }
//            answer = temp + answer;
//        }
//        return answer;
//    }