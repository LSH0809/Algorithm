package company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// 직사각형이 겹치는 지 안겹치는 지 판단
class Solution {
    public static void main(String[] args) {
        String[] str1 = {"!@ab12cCbA21@!!!!!", "!@ab12cCbA21@!", "ab12cCbA21"};
        String[] str2 = {"data", "science"};
        String[] str3 = {"a", "0&1*0"};

        System.out.println(solution(str1));
        System.out.println(solution(str2));
        System.out.println(solution(str3));
    }

    public static int solution(String[] s) {

        int answer = -1;

        for (int i = 0; i < s.length; i++) {
            StringBuffer charSb = new StringBuffer();
            StringBuffer numSb = new StringBuffer();
            StringBuffer etcSb = new StringBuffer(); // 각각 다른 문자열을 담을 수 있도록 구분하여 선언
            int maxValue = 0;

            for (int j = 0; j < s[i].length(); j++) {

                int value = (s[i].charAt(j)); // 조건문에서 아스키 코드를 활용할 수 있도록 int형으로 선언

                if ((value >= 65 && value <= 90) || (value >= 97 && value <= 122)) {
                    charSb.append((char) value);
                } else if (value >= 48 && value <= 57) {
                    numSb.append((char) value);
                } else {
                    etcSb.append((char) value);
                } // 아스키코드와 조건문에 의해 이전에 선언한 StringBuffer 객체에 추가
            }

            if (isPalindrome(charSb) && isPalindrome(numSb) && isPalindrome(etcSb)) {
                maxValue = s[i].length();
            }// 모두 펠린드롬 문자열일 경우, 길이가 필요하므로 maxValue 변수에 길이 할당

            answer = Math.max(answer, maxValue); //다음 문자열 확인 이전에 최대값 갱신
        }
        return answer;
    }

    private static boolean isPalindrome(StringBuffer sb) {
        StringBuffer checkSb = new StringBuffer(sb.toString().toLowerCase());
        // 문자열 대소문자는 상관없으므로, 소문자로 모두 치환

        if (checkSb.toString().equals(checkSb.reverse().toString())) {
            return true;
        }
        return false;
    }// StringBuffer의 reverse() 메소드를 이용해서 boolean 반환
}
