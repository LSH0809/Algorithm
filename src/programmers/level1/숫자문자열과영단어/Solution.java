package programmers.level1.숫자문자열과영단어;

public class Solution {
	
	public static void main(String[] args) {
		String s1 = "one4seveneight";
		String s2 = "23four5six7";
		String s3 = "2three45sixseven";
		String s4 = "123";
		
		System.out.println(solution(s1));
		System.out.println(solution(s2));
		System.out.println(solution(s3));
		System.out.println(solution(s4));
	}
	public static int solution(String s) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i< s.length() - 1; i++){
			for(int j = i + 1; j< s.length() + 1; j++){
				char c = s.substring(i,j).charAt(0);
				if(c >= '0' && c <= '9'){
					sb.append(s,i,j);
					i = j;
					continue;
				}
				int tempNum = getNumber(s.substring(i,j));
				if(getNumber(s.substring(i,j)) >= 0){
					sb.append(tempNum);
					i = j;
				}
				
			}
		}
		return Integer.parseInt(sb.toString());
	}
	
	private static int getNumber(String s){
		int number = -1;
		switch (s){
			case "zero" :
				number = 0;
				break;
			case "one" :
				number = 1;
				break;
			case "two" :
				number = 2;
				break;
			case "three" :
				number = 3;
				break;
			case "four" :
				number = 4;
				break;
			case "five" :
				number = 5;
				break;
			case "six" :
				number = 6;
				break;
			case "seven" :
				number = 7;
				break;
			case "eight" :
				number = 8;
				break;
			case "nine" :
				number = 9;
				break;
			default:
				break;
		}
		return number;
	}
}
