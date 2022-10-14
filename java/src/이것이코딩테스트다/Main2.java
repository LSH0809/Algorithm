package 이것이코딩테스트다;

public class Main2 {

	static int[][] arr;
	static boolean[][] visited;
	static int[] dx1 = {-1};
	static int[] dy1 = {-1};
	static int[] dx2 = {1};
	static int[] dy2 = {-1};
	static int[] dx3 = {1};
	static int[] dy3 = {1};
	static int[] dx4 = {-1};
	static int[] dy4 = {1};
	static int count;

	public static void main(String[] args) {
		String[] bishops = {"C6","A4","E5"};
		String[] bishops2 = {"C6"};

		System.out.println(solution(bishops));
		System.out.println(solution(bishops2));


	}

	public static int solution(String[] bishops){
		arr = new int[9][9];
		visited = new boolean[9][9];
		count = 0;
		for(int i = 0; i< bishops.length; i++){
			String[] split = bishops[i].split("");
			int xIdx = split[0].charAt(0) - 65 + 1;
			int yIdx = Integer.parseInt(split[1]);
			arr[xIdx][yIdx] = 1;
		}
		for(int i = 1; i< arr.length; i++){
			for(int j = 1; j< arr.length; j++){
				if(arr[i][j] == 1){
					solve(i,j);
				}
			}
		}
		System.out.println("count : " + count);
		System.out.println("arr : " + bishops.length);
		return 64 - count - bishops.length;
	}

	public static void solve(int x, int y){
		visited[x][y] = true;
		for(int i = 0; i< 1; i++){
			int nextX = x + dx1[i];
			int nextY = y + dy1[i];

			if(nextX > 0 && nextY > 0 && nextX <= 8 && nextY <= 8){
				if(!visited[nextX][nextY] && arr[nextX][nextY] == 0){

					count += 1;
				}
			}
		}

		for(int i = 0; i< 1; i++){
			int nextX = x + dx2[i];
			int nextY = y + dy2[i];

			if(nextX > 0 && nextY > 0 && nextX <= 8 && nextY <= 8){
				if(!visited[nextX][nextY] && arr[nextX][nextY] == 0){

					count += 1;
				}
			}
		}

		for(int i = 0; i< 1; i++){
			int nextX = x + dx3[i];
			int nextY = y + dy3[i];

			if(nextX > 0 && nextY > 0 && nextX <= 8 && nextY <= 8){
				if(!visited[nextX][nextY] && arr[nextX][nextY] == 0){

					count += 1;
				}
			}
		}

		for(int i = 0; i< 1; i++){
			int nextX = x + dx4[i];
			int nextY = y + dy4[i];

			if(nextX > 0 && nextY > 0 && nextX <= 8 && nextY <= 8){
				if(!visited[nextX][nextY] && arr[nextX][nextY] == 0){
					count += 1;
				}
			}
		}
	}
}
