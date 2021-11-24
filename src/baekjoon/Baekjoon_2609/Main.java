package baekjoon.Baekjoon_2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		System.out.println(gcd(n, m));
		System.out.println(lcm(n, m));
	}

	public static int gcd(int x, int y) {
		if (x % y == 0) {
			return y;
		}
		return gcd(y, x % y);
	}

	public static int lcm(int x, int y) {
		return x * y / gcd(x, y);
	}
}
