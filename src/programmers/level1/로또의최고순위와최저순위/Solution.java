package programmers.level1.로또의최고순위와최저순위;

class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
		// 최저 등수는 0이 아닌 숫자의 개수
		// 최고 등수는 0이 다 맞는 다는 가정
		// 등수 반환 메소드 따로 필요
		int winCount = 0;
		int zeroCount = 0;
		int[] answer = new int[2];
		
		for(int i = 0; i< lottos.length; i++){
			if(lottos[i] == 0){
				zeroCount += 1;
			}
			
			for(int j = 0; j< win_nums.length; j++){
				if(lottos[i] == win_nums[j]){
					winCount += 1;
					break;
				}
			}
		}
		
		answer[0] = getRank(winCount + zeroCount);
		answer[1] = getRank(winCount);
		
		return answer;
	}
	
	private int getRank(int win){
		int rank = 0;
		
		switch(win){
			case 0 :
			case 1:
				rank = 6;
				break;
			case 2:
				rank = 5;
				break;
			case 3:
				rank = 4;
				break;
			case 4:
				rank = 3;
				break;
			case 5:
				rank = 2;
				break;
			case 6:
				rank = 1;
				break;
		}
		return rank;
	}
}
