package programmers.level1.최소직사각형;

class Solution {
	public int solution(int[][] sizes) {
		int[][] temp = new int[sizes.length][2];
		int x = Integer.MIN_VALUE;
		int y = Integer.MIN_VALUE;
		for(int i = 0; i< sizes.length; i++){
			temp[i][0] = Math.max(sizes[i][0],sizes[i][1]);
			temp[i][1] = Math.min(sizes[i][0],sizes[i][1]);
		}
		
		for(int i = 0; i< temp.length; i++){
			x = Math.max(temp[i][0],x);
			y = Math.max(temp[i][1],y);
		}
		
		return x * y;
	}
}
