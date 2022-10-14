package baekjoon.Baekjoon_1759;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int L, C;
    static String[] arr;

    public static boolean check(String input) {
        int consonant = 0;
        int vowel = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u')
                vowel += 1;
            else
                consonant += 1;
        }
        if (vowel < 1 || consonant < 2)
            return false;
        else
            return true;
    }

    public static void solve(int idx, String str) {
        if (str.length() == L && check(str)) {
            System.out.println(str);
            return;
        }
        if (idx >= C)
            return;

        solve(idx + 1, str + arr[idx]);
        solve(idx + 1, str);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        arr = new String[C];
        for (int i = 0; i < C; i++) {
            arr[i] = st.nextToken();
        }

        Arrays.sort(arr);

        solve(0, "");
    }
}
