package programmers.level2.베스트앨범;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays =  {500, 600, 150, 800, 2500};

        System.out.println(Arrays.toString(solution(genres, plays)));
    }

    public static int[] solution(String[] genres, int[] plays) {

        // genres마다 숫자 비교해야 한다.
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i< genres.length; i++){
            map.put(genres[i],map.getOrDefault(genres[i],0) + plays[i]);
        }

        List<String> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        List<Integer> temp = new ArrayList<>();

        for(String str : list){
            int firstIdx = 0;
            int secondIdx = 0;
            int maxValue = Integer.MIN_VALUE;
            for(int i = 0; i< genres.length; i++){
                if(str.equals(genres[i]) && plays[i] > maxValue){
                    maxValue = plays[i];
                    firstIdx= i;
                }
            }

            maxValue = 0;
            for(int i = 0; i< genres.length; i++){
                if(str.equals(genres[i]) && i!= firstIdx && plays[i] > maxValue){
                    maxValue = plays[i];
                    secondIdx = i;
                }
            }


            if(maxValue != 0){
                temp.add(firstIdx);
                temp.add(secondIdx);
            }else{
                temp.add(firstIdx);
            }
        }
        int[] answer = new int[temp.size()];
        for(int i = 0; i< temp.size(); i++){
            answer[i] = temp.get(i);
        }
        return answer;
    }
}
