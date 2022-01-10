package baekjoon.Baekjoon_15650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n,m;
	static boolean[] visited;
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		visited = new boolean[m];
		
		solve(0);
	}
	
	public static void solve(int idx){
		if (m == idx) {
			for (int i=0; i<m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		} else {
			for (int i=1; i<=n; i++) {
				if (!visited[i]) {
					if (idx == 0 || arr[idx-1] < i) {
						//d == 0은 다 출력 (1,2 | 1,3 | 1,4)
						//이전 arr[]원소가 현재 i보다 작을 때
						
						visited[i] = true; //방문 처리
						arr[idx] = i; //원소 담기
						
						solve(idx + 1); //재귀
						
						//원상복구
						visited[i] = false;
					}
				}
			}
		}
	}
}
