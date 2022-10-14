package programmers.level2.숫자의표현;

class Solution {
	
	static int count;
	
	public int solution(int n) {
		count = 1; // n = n 인 경우는 무조건 발생하므로 1에서 시작
		for(int i = 1; i< n; i++){
			int sum = 0;
			sum += i;
			for(int j = i + 1; j < n + 1 ; j++){
				sum += j;
				if(sum == n){
					count += 1;
					break;
				}else if (sum > n){
					break;
				}
			}
		}
		return count;
	}
}

