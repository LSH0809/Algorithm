package baekjoon.Baekjoon_18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		Map<Integer, Integer> map = new HashMap();
		StringBuffer sb = new StringBuffer();
		int idx = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int[] copyArr = arr.clone();
		Arrays.sort(copyArr);
		for (int i : copyArr) {
			if (!map.containsKey(i)) {
				map.put(i, idx++);
			}
		}

		for (int i : arr) {
			sb
				.append(map.get(i))
				.append(" ");
		}

		System.out.println(sb);
	}
}
