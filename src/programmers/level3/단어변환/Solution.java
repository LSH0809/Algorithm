package programmers.level3.단어변환;

public class Solution {
    static boolean[] visited;
    static int answer;

    public int solution(String begin, String target, String[] words) {
        answer = -1;
        visited = new boolean[words.length];

        dfs(begin, target, words, 0);

        if (answer == -1) {
            answer = 0;
        }

        return answer;
    }

    public void dfs(String begin, String target, String[] words, int count) {
        if (begin.equals(target)) {
            answer = count;
            return;
        } else {
            for (int i = 0; i < words.length; i++) {
                if (visited[i] == false && check(begin, words[i]) == true) {
                    visited[i] = true;
                    dfs(words[i], target, words, count + 1);
                    visited[i] = false;
                }
            }
        }
    }

    public boolean check(String word1, String word2) {
        int count = 0;

        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                count++;
            }
        }

        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }
}
