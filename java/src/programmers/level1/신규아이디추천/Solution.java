package programmers.level1.신규아이디추천;

class Solution {
	public String solution(String new_id) {
		// 1. 모든 문자를 소문자로 치환
		new_id = new_id.toLowerCase();
		
		// 2. 알파벳 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 모든 문자 제거
		// 제거를 하려하면 조건을 추가해야 하는 경우가 너무 많음 -> 위 조건에 맞는 것만 따로 보관
		StringBuffer sb = new StringBuffer();
		
		if(new_id.length() > 0){
			for(int i = 0; i< new_id.length(); i++){
				char ch = new_id.charAt(i);
				
				if(ch >= 'a' && ch <= 'z'){
					sb.append(ch);
				}else if(ch >= '0' && ch <= '9'){
					sb.append(ch);
				}else if(ch == '-' || ch == '_' || ch == '.'){
					sb.append(ch);
				}
			}
			
			// 3. 마침표가 2번 이상 연속되면 하나로 치환한다.
			String temp = sb.toString();
			while(temp.contains("..")){
				temp = temp.replace("..",".");
			}
			sb = new StringBuffer(temp);
			
			// 4. 마침표 처음이나 끝에 위치한다면 제거
			if(sb.length() > 0){
				if(sb.charAt(0) == '.'){
					sb.deleteCharAt(0);
				}
			}
			if(sb.length() > 0 ){
				if(sb.charAt(sb.length() - 1) == '.'){
					sb.deleteCharAt(sb.length() - 1);
				}
			}
		}
		
		// 5. new_id가 빈문자열이면 'a' 대입
		if(sb.length() == 0){
			sb.append("a");
		}
		
		// 6-1. 길이가 16자 이상이면, 15개만 자르기
		if(sb.length() >= 16){
			sb = new StringBuffer(sb.substring(0,15));
		}
		
		// 6-2. 마침표가 끝에 있으면 마침표 제거
		if(sb.charAt(sb.length() - 1) == '.'){
			sb.deleteCharAt(sb.length() - 1);
		}
		
		// 7. 길이가 2자 이하이면, 마지막 문자를 길이가 3이 될때까지 반복해서 끝에 붙이기
		while(sb.length() <= 2){
			sb.append(sb.charAt(sb.length() - 1));
		}
		
		return sb.toString();
	}
}
