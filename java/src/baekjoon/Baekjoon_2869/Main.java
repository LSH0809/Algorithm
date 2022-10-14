package baekjoon.Baekjoon_2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int count = 0;

		for(int i = 1; i< v; i++){
			count += 1;
			if(a * i - b * (i-1) >= v){
				break;
			}
		}
		System.out.println(count);
	}
}
