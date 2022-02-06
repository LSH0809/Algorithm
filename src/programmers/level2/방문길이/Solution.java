package programmers.level2.방문길이;

class Solution {
	public int solution(String dirs) {
		int[][] arr = new int[11][11];
		boolean[][][][] visited = new boolean[11][11][11][11];
		char[] dirsArr= dirs.toCharArray();
		int count = 0;
		Point now = new Point(5,5);
		
		for(char str : dirsArr){
			switch(str){
				case 'U' :
					if(!isIn(now.x,now.y + 1)){
						continue;
					}
					if(isValid(visited, now.x,now.y,now.x,now.y + 1)){
						count += 1;
					}
					visited[now.x][now.y][now.x][now.y + 1] = true;
					visited[now.x][now.y + 1][now.x][now.y] = true;
					now.y += 1;
					break;
				
				case 'D' :
					if(!isIn(now.x, now.y - 1)){
						continue;
					}
					if(isValid(visited, now.x,now.y,now.x,now.y - 1)){
						count += 1;
					}
					visited[now.x][now.y][now.x][now.y - 1] = true;
					visited[now.x][now.y - 1][now.x][now.y] = true;
					now.y -= 1;
					break;
				
				case 'R' :
					if(!isIn(now.x + 1, now.y)){
						continue;
					}
					if(isValid(visited, now.x,now.y,now.x + 1, now.y)){
						count += 1;
					}
					visited[now.x][now.y][now.x + 1][now.y] = true;
					visited[now.x + 1][now.y][now.x][now.y] = true;
					now.x += 1;
					break;
				
				case 'L' :
					if(!isIn(now.x - 1, now.y)){
						continue;
					}
					if(isValid(visited, now.x,now.y,now.x - 1, now.y)){
						count += 1;
					}
					visited[now.x][now.y][now.x - 1][now.y] = true;
					visited[now.x - 1][now.y][now.x][now.y] = true;
					now.x -= 1;
					break;
			}
		}
		return count;
	}
	
	private static boolean isValid(boolean[][][][] visited, int x1, int y1, int x2, int y2){
		if(visited[x1][y1][x2][y2] == true && visited[x2][y2][x1][y1] == true){
			return false;
		}
		return true;
	}
	
	private static boolean isIn(int x, int y){
		if(x < 0 || y < 0 || x > 10 || y > 10){
			return false;
		}
		return true;
	}
	
	static class Point{
		int x,y;
		
		Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}
