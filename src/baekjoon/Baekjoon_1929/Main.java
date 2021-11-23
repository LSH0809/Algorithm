package baekjoon.Baekjoon_1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		boolean[] arr = new boolean[n+1];

		arr[0] = true;
		arr[1] = true;

		for(int i = 2; i<Math.sqrt(n+1);i++){
			for(int j = i * i; j < n+1; j+=i){
				arr[j] = true;
			}
		}

		for(int i = m; i <= n; i++){
			if(!arr[i]){
				System.out.println(i);
			}
		}
	}
}
