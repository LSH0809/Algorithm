package baekjoon.Baekjoon_1406;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		LinkedList<Character> list = new LinkedList<>();
		String str = br.readLine();
		int m = Integer.parseInt(br.readLine());
		for (int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}
		int index = list.size();

		while (m-- > 0) {
			String order = br.readLine();
			char o = order.charAt(0);
			switch (o) {
				case 'L':
					if (index != 0) {
						index -= 1;
					}
					break;

				case 'D':
					if (index != list.size()) {
						index += 1;
					}
					break;

				case 'B':
					if (index != 0) {
						list.remove(index - 1);
						index -= 1;
					}
					break;

				case 'P':
					char word = order.charAt(2);
					list.add(index, word);
					index += 1;
					break;

				default:
					break;
			}
		}

		for (Character character : list) {
			bw.write(character);
		}
		bw.flush();
	}
}
