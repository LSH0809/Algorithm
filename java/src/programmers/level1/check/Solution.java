package programmers.level1.check;

public class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        String str = "";
//
//        str = changeToThree(n);
//        answer = Integer.parseInt(reverse(str), 3);
//
//        return answer;
//    }
//
//    public String reverse(String n) {
//        String[] temp = n.split("");
//        String temp_return = "";
//
//        for (int i = temp.length - 1; i >= 0; i--) {
//            temp_return += temp[i];
//        }
//
//        return temp_return;
//    }
//
//    public String changeToThree(int n) {
//        String change_value = "";
//
//        while (n > 0) {
//            change_value = (n % 3) + change_value;
//            n /= 3;
//        }
//
//        return change_value;
//    }


    public String solution(String[] seoul) {
        String answer = "";
        String index = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = String.valueOf(i);
                break;
            }
        }

        answer = "김서방은 " + index + "에 있다";

        return answer;
    }
}
