package baekjoon.Baekjoon_7662;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
			int orderNum = Integer.parseInt(br.readLine());
			TreeMap<Integer, Integer> map = new TreeMap<>();
			
			while (orderNum-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine()," ");
				String order = st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				
				if (order.equals("I")) {
					map.put(num,map.getOrDefault(num,0) + 1);
				} else {
					if (map.size() == 0) {
						continue;
					}
					int deleteNumKey = num == -1  ? map.firstKey()  : map.lastKey();
					if (map.get(deleteNumKey) == 1) {
						map.remove(deleteNumKey);
					} else if (map.get(deleteNumKey) > 1) {
						map.put(deleteNumKey,map.get(deleteNumKey) - 1);
					}
				}
			}
			if (map.size() == 0) {
				System.out.println("EMPTY");
			} else {
				System.out.println(map.lastKey() + " " + map.firstKey());
			}
		}
	}
}
