package baekjoon.Baekjoon_9996;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int lineIndex = input.indexOf('*');

        String first = input.substring(0, lineIndex);
        String last = input.substring(lineIndex + 1);

        int firstLength = first.length();
        int lastLength = last.length();

        while(n-- > 0){
            String temp = br.readLine();

            if (temp.length() < input.length() - 1) {
                System.out.println("NE");
            } else {
                String tempFirst = temp.substring(0, firstLength);
                String tempLast = temp.substring(temp.length() - lastLength);

                if (tempFirst.equals(first) && tempLast.equals(last)) {
                    System.out.println("DA");
                } else {
                    System.out.println("NE");
                }
            }
        }
    }
}
