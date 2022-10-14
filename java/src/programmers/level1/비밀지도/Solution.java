package programmers.level1.비밀지도;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String s1 = change(arr1[i], n);
            String s2 = change(arr2[i], n);
            String temp_string = "";

            for (int j = 0; j < n; j++) {

                if (s1.charAt(j) == '1' || s2.charAt(j) == '1') {
                    temp_string += "#";
                } else {
                    temp_string += " ";
                }
            }
            answer[i] = temp_string;
        }
        return answer;
    }

    public String change(int num, int len) {
        String temp = Integer.toBinaryString(num);

        while (temp.length() != len) {
            temp = "0" + temp;
        }
        return temp;
    }
}
