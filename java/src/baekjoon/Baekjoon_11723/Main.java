package baekjoon.Baekjoon_11723;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(br.readLine());
		int bitmask = 0;
		StringBuilder sb = new StringBuilder();
		
		while(m-- > 0){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			String order = st.nextToken();
			
			switch (order){
				case "all" :
					bitmask = (1 << 21) - 1;
					break;
				case "empty" :
					bitmask = 0;
					break;
				default:
					int value = Integer.parseInt(st.nextToken());
					switch (order){
						case "add" :
							bitmask |= (1 << value);
							break;
						case "remove" :
							bitmask &= ~(1 << value);
							break;
						case "check" :
							sb.append((bitmask & (1 << value)) != 0 ? 1 : 0).append("\n");
							break;
						case "toggle" :
							bitmask ^= (1 << value);
							break;
					}
			}
		}
		bw.write(sb.toString());
		bw.close();
	}
}
