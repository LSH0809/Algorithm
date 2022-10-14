package baekjoon.Baekjoon_10825;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static class Score implements Comparable<Score> {
        String name;
        int korean;
        int english;
        int math;

        public Score(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }

        public String getName() {
            return name;
        }

        public int getKorean() {
            return korean;
        }

        public int getEnglish() {
            return english;
        }

        public int getMath() {
            return math;
        }

        @Override
        public int compareTo(Score s) {
            if (this.korean > s.korean) {
                return -1;
            } else if (this.korean == s.korean) {
                if (this.english < s.english) {
                    return -1;
                } else if (this.english == s.english) {
                    if (this.math > s.math) {
                        return -1;
                    } else if (this.math == s.math) {
                        return this.name.compareTo(s.name);
                    } else return 1;
                } else return 1;
            } else return 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Score> scoreList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            scoreList.add(new Score(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        Collections.sort(scoreList);

        for (Score score : scoreList) {
            System.out.println(score.name);
        }
    }
}
