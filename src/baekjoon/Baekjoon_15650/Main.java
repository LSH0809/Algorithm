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
		visited = new boolean[n + 1];
		
		solve(0);
	}
	
	public static void solve(int idx){
		if (m == idx) {
			for (int i=0; i<m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		} else {
			for (int i=1; i<=n; i++) {
				if (!visited[i]) {
					if (idx == 0 || arr[idx-1] < i) {
						visited[i] = true;
						arr[idx] = i;
						solve(idx + 1);
						visited[i] = false;
					}
				}
			}
		}
	}
}
