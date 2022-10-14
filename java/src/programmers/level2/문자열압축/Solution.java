package programmers.level2.문자열압축;

public class Solution {
	
	public static void main(String[] args) {
		String s1 = "aabbaccc";
		String s2 = "ababcdcdababcdcd";
		String s3 = "abcabcdede";
		String s4 = "abcabcabcabcdededededede";
		String s5 = "xababcdcdababcdcd";
		
		System.out.println(solution(s1));
		System.out.println(solution(s2));
		System.out.println(solution(s3));
		System.out.println(solution(s4));
		System.out.println(solution(s5));
	}
	
	public static int solution(String s) {
		int answer = Integer.MAX_VALUE;
		if(s.length() == 1){
			return 1;
		}
		for(int i = 1; i< s.length() / 2 + 1; i++){
			int count = 1;
			StringBuilder sb = new StringBuilder();
			String str = s.substring(0,i);
			int limit = 0;
			for(int j = i; j< s.length() + 1; j += i){

				if(i + j > s.length()){
					limit = s.length();
				}else{
					limit = i + j;
				}
				String next = s.substring(j,limit);
				if(str.equals(next)){
					count += 1;
				}else{
					if(count == 1){
						sb.append(str);
					}else{
						sb.append(count).append(str);
					}
					str = next;
					count = 1;
				}
			}
			sb.append(str);
			answer = Math.min(answer,sb.length());
		}
		return answer;
	}
}
