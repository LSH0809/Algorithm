package programmers.level1.연도;

public class Solution {
    public String solution(int a, int b) {
        String answer = "";

        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] year = new String[366];
        int want_day = 0;

        for (int i = 0; i < year.length; i++) {
            year[i] = day[(i + 5) % 7];
        }

        for (int i = 0; i < a - 1; i++) {
            want_day += month[i];
        }

        want_day += b - 1;
        answer = year[want_day];

        return answer;
    }
}
