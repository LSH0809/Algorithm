package company;

public class Solution9 {
    static int answer;

    public static String solution(String S) {

        String[] arr = new String[S.length()];
        for (int i = 0; i < S.length(); i++) {
            arr[i] = String.valueOf(S.charAt(i));
        }
        String[] output = new String[arr.length];
        boolean[] visited = new boolean[arr.length];
        answer = 0;

        for (int i = 1; i < arr.length + 1; i++) {
            perm(arr, visited, 0, arr.length, i, output);
        }

        return String.valueOf(answer);
    }

    static void perm(String[] arr, boolean[] visited, int start, int n, int r, String[] output) {
        if (start == r) {
            StringBuilder sb = new StringBuilder();
            for (String c : output) {
                if (c == null) {
                    continue;
                }

                sb.append(c);
            }

            if (isPalindrome(sb.toString())) {
                answer = Math.max(answer, Integer.parseInt(sb.toString()));
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[start] = arr[i];
                perm(arr, visited, start + 1, n, r, output);
                output[start] = "";
                visited[i] = false;
            }
        }
    }

    private static boolean isPalindrome(String s) {
        int num = Integer.parseInt(s);
        StringBuffer sb = new StringBuffer(String.valueOf(num));

        if (!sb.toString().equals(sb.reverse().toString())) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "39878";
        String s2 = "8199";
        String s3 = "00900";
        String s4 = "0000";
        String s5 = "54321";

        System.out.println(solution(s1)); // 898
        System.out.println(solution(s2)); // 989
        System.out.println(solution(s3)); // 9
        System.out.println(solution(s4)); // 0
        System.out.println(solution(s5)); // 5
    }
}