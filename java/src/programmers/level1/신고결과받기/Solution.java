package programmers.level1.신고결과받기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
	
	public static void main(String[] args) {
		String[] id_list1 = {"muzi", "frodo", "apeach", "neo"};
		String[] report1 = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k1 = 2;
		
		String[] id_list2 = {"con", "ryan"};
		String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
		int k2 = 3;
		
		System.out.println(Arrays.toString(solution(
				id_list1,
				report1,
				k1
		)));
		System.out.println(Arrays.toString(solution(
				id_list2,
				report2,
				k2
		)));
	}
	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		Map<String,Integer> map = new HashMap<>();
		Set<String> set = new HashSet<>(Arrays.asList(report));
		
		report = set.toArray(new String[set.size()]);
		
		for(int i = 0; i< report.length; i++){
			String[] s = report[i].split(" ");
			map.put(s[1],map.getOrDefault(s[1],0) + 1);
		}
		
		List<String> stop = new ArrayList<>();
		for(String str : map.keySet()){
			if(map.get(str) >= k){
				stop.add(str);
			}
		}

		Map<String,Integer> fromMap = new HashMap<>();
		for(int i = 0; i< report.length; i++){
			String[] s = report[i].split(" ");
			if(stop.contains(s[1])){
				fromMap.put(s[0],fromMap.getOrDefault(s[0],0) + 1);
			}
		}
		
		for(int i = 0; i< id_list.length; i++){
			answer[i] = fromMap.getOrDefault(id_list[i],0);
		}
		
		return answer;
	}
}
