package programmers.level2.뉴스클러스터;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static List<String> toList(String input) {
        List<String> list = new ArrayList<>();
        input = input.toUpperCase();

        for (int i = 0; i < input.length() - 1; i++) {
            char a = input.charAt(i);
            char b = input.charAt(i + 1);

            if (Character.isLetter(a) == true && Character.isLetter(b) == true) {
                String str = a + "" + b;
                list.add(str);
            }
        }
        return list;
    }

    public int solution(String str1, String str2) {
        int answer = 0;
        double value = 0;
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> intersection_list = new ArrayList<>();
        List<String> union_list = new ArrayList<>();

        list1 = toList(str1);
        list2 = toList(str2);

        Collections.sort(list1);
        Collections.sort(list2);

        for (String str : list1) {
            if (list2.contains(str)) {
                list2.remove(str);
                intersection_list.add(str);
            }
            union_list.add(str);
        }

        for (String str : list2) {
            union_list.add(str);
        }

        if (union_list.size() == 0) {
            value = 1;
        } else {
            value = (double) intersection_list.size() / (double) union_list.size();
        }
        answer = (int) (value * 65536);

        return answer;
    }
}
