package 이것이코딩테스트다;

import java.util.Arrays;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        int[] grade = {3, 2, 1, 2};
        int[] grade2 = {2, 2, 1};

        System.out.println(Arrays.toString(solution(grade)));
        System.out.println(Arrays.toString(solution(grade2)));
    }

    public static int[] solution(int[] grade) {
        int len = grade.length;
        Integer[] cloneGrade = new Integer[len];
        int[] answer = new int[len];
        int[] rank = new int[len];

        for (int i = 0; i < len; i++) {
            cloneGrade[i] = grade[i];
        }
        Arrays.sort(cloneGrade, Collections.reverseOrder());


        rank[0] = 1;
        for (int i = 1; i < len; i++) {
            if (cloneGrade[i] == cloneGrade[i - 1]) {
                rank[i] = rank[i - 1];
            } else {
                rank[i] = i + 1;
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (cloneGrade[j] == grade[i]) {
                    answer[i] = rank[j];
                }
            }
        }
        return answer;
    }
}
