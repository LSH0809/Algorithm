package 이것이코딩테스트다.정렬.실전문제;

import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 성적이 낮은 순서로 학생 출력하기
public class Q3 {

    static class Student implements Comparable<Student> {
        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        @Override
        public int compareTo(Student o) {
            if (this.score < o.score) {
                return -1;
            }
            return 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, " ");
            studentList.add(new Student(st.nextToken(), Integer.parseInt(st.nextToken())));
        }

        Collections.sort(studentList);

        for (int i = 0; i < studentList.size(); i++) {
            System.out.print(studentList.get(i).getName() + " ");
        }

    }
}
