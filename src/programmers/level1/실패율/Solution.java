package programmers.level1.실패율;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] stage_person = new double[N + 1];
        List<Double> fail_percentage = new ArrayList<Double>();

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] == N + 1) {
                continue;
            }
            stage_person[stages[i]]++;
        }

        double total = stages.length;
        double temp = 0.0;

        for (int i = 1; i < stage_person.length; i++) {
            temp = stage_person[i];
            if (total == 0) {
                stage_person[i] = 0.0;
            } else {
                stage_person[i] = stage_person[i] / total;
                total -= temp;
            }
            fail_percentage.add(stage_person[i]);
        }

        Collections.sort(fail_percentage, Collections.reverseOrder());

        for (int i = 0; i < fail_percentage.size(); i++) {
            for (int j = 1; j < stage_person.length; j++) {
                if (fail_percentage.get(i) == stage_person[j]) {
                    answer[i] = j;
                    stage_person[j] = -1.0;
                    break;
                }
            }
        }
        return answer;
    }
}
