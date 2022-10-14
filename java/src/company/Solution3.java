package company;

import java.util.*;

class Solution3 {
    public static void main(String[] args) {
        String s1 = "{cpp{java}}{python}";
        String s2 = "ab{}cd{efg{}h}{ij}";

        int[] idx1 = {0, 4, 9, 10, 11, 18};
        int[] idx2 = {3, 6, 11, 3, 14, 11};

        System.out.println(Arrays.toString(solution(s1, idx1)));
        System.out.println(Arrays.toString(solution(s2, idx2)));
    }

    public static int[] solution(String s, int[] idx) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        char[] sToChar = s.toCharArray();

        for (int i = 0; i < sToChar.length; i++) {
            if (sToChar[i] == '{') {
                stack.push('{');
                list.add(i);
            } else if (sToChar[i] == '}') {
                stack.pop();
                map.put(list.get(list.size() - 1), i);
                list.remove(list.size() - 1);
            }
        } // '{' 와 '}'의 경우 스택 자료구조를 이용해서 추가 및 삭제
        // 만약 삭제할 경우 map에 key-value 형식으로 추가 및 list에서는 삭제
        // list는 여기서 size()가 0이 되므로 아래에서 재활용할 계획

        Map<Integer, Integer> reverseMap = new HashMap<>();

        for (Integer key : map.keySet()) {
            reverseMap.put(map.get(key), key);
        } // 기존의 map 자료구조를 이용해서 반대의 경우에도 선언

        for (int i = 0; i < idx.length; i++) {
            if (map.containsKey(idx[i])) {
                list.add(map.get(idx[i]));
            } else {
                list.add(reverseMap.get(idx[i]));
            }
        } // map 자료구조 내부에 값이 있는지 확인하면서 map 혹은 reverseMap 에서 값을 list에 추가가

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        } // 반환타입인 배열로 수정 후 반환

        return answer;
    }
}