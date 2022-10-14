package programmers.level1.같은숫자는싫어;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int temp = 10;
        for(int i= 0;i<arr.length;i++){
            if(arr[i] != temp){
                list.add(arr[i]);
                temp = arr[i];
            }
        }

        int[] answer = new int[list.size()];
        for(int i = 0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;

    }
}