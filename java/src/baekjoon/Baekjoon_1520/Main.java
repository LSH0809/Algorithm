package baekjoon.Baekjoon_1520;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	static int min;
	static String target;
	static int target_num;
	static boolean[] btn = {true, true, true, true, true, true, true, true, true, true};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		target = br.readLine();
		target_num = Integer.parseInt(target);

		int broken = Integer.parseInt(br.readLine());
		String[] broken_num;
		min = Integer.MAX_VALUE;

		if(broken != 0){
			broken_num = br.readLine().split(" ");
			for(int i=0; i<broken_num.length; i++)
				btn[Integer.parseInt(broken_num[i])] = false;
		}

		if(target.equals("100")){
			System.out.println(0);
			return;
		}

		int cnt = Math.abs(100 - target_num);
		min = Math.min(min, cnt);

		dfs(0, "");
		System.out.println(min);
	}

	public static void dfs(int idx, String click){
		for(int i=0; i<10; i++){
			if(btn[i]){
				String newStr = click + Integer.toString(i);
				int cnt = Math.abs(target_num - Integer.parseInt(newStr)) + newStr.length();
				min = Math.min(min, cnt);
				if(idx < 6)
					dfs(idx+1, newStr);
			}
		}
	}
}