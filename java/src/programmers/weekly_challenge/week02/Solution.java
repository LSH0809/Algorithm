package programmers.weekly_challenge.week02;

import java.util.*;

class Solution {
    public static String check(double average){
        if(average >= 90.0)
            return "A";
        else if(average >= 80.0)
            return "B";
        else if(average >= 70.0)
            return "C";
        else if(average >= 50.0)
            return "D";
        else
            return "F";
    }

    public static String solution(int[][] scores) {
        StringBuffer sb = new StringBuffer();
        int len = scores.length;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i< len; i++){
            int max_value = Integer.MIN_VALUE;
            int min_value = Integer.MAX_VALUE;
            int sum = 0;
            double average = 0;
            int self_value = 0;
            list.clear();

            for(int j = 0; j< len; j++){
                if(j == i){
                    self_value = scores[j][i];
                }
                max_value = Math.max(max_value,self_value);
                min_value = Math.min(min_value,self_value);
                list.add(scores[j][i]);
            }

            if((Collections.frequency(list,self_value) == 1 && (min_value == self_value)) || Collections.frequency(list,self_value) == 1 && (max_value == self_value)){
                list.remove((Integer) self_value);
            }

            for (Integer integer : list) {
                sum += integer;
            }

            average = (double)sum / (double)list.size();

            sb.append(check(average));
        }
        return sb.toString();
    }
}
