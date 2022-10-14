package company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution2 {

    public static void main(String[] args) {
        int[][] skills1 = {{50, 3}, {100, 4}, {200, 2}, {600, 1}};
        int boss1 = 1024;

        int[][] skills2 = {{100, 3}, {70, 2}, {200, 5}};
        int boss2 = 1000000;

        int[][] skills3 = {{250, 100}};
        int boss3 = 1001;

        System.out.println(Arrays.toString(solution(skills1, boss1)));
        System.out.println(Arrays.toString(solution(skills2, boss2)));
        System.out.println(Arrays.toString(solution(skills3, boss3)));
    }

    public static int[] solution(int[][] skills, int boss) {
        int totalCount = 0;
        int tryChance = 0; // 가능한 모든 공격횟수의 합
        int show = 0; // 가능한 모든 스킬을 보여줬는지에 대한 정보를 담는 변수이다. phase와 관련한 개념이다.
        int idx = 0;

        Set<Integer> set = new HashSet<>();
        int[] skillPower = new int[skills.length]; // 각 스킬의 공격력 정보를 가지고 있는 배열
        int[] skillTry = new int[skills.length]; // 각 스킬마다 시도 가능한 횟수 정보를 가지고 있는 배열

        for (int i = 0; i < skills.length; i++) {
            int value = skills[i][1];

            skillPower[i] = skills[i][0];
            skillTry[i] = value;
            tryChance += value;
        }// 공격력, 횟수 정보를 위한 배열에 값 할당 및 가능한 모든 공격 횟수 계산

        while (true) {

            if (boss <= 0 || tryChance == totalCount) {
                break;
            }// 보스 체력이 0이하이거나, 시도한 횟수가 가능한 모든 공격횟수의 합과 같아지면 반복문을 탈출한다.

            if (show >= skills.length) {
                idx %= skills.length;
                idx = (skills.length) - 1 - (idx); // 공격력이 높은 순으로 스킬을 사용해야하므로 스킬배열의 길이를 활용해서 계산

                if (skillTry[idx] <= 0) {
                    idx -= 1;
                }// 스킬 사용횟수가 없다면, 인덱스를 계산한다.

            } else {
                idx %= skills.length; // 인덱스를 길이로 나누어서 해당하는 스킬 찾도록 변경
            }
            // 스킬을 한바퀴 돌았다면, 이후부터는 idx는 공격력이 높은 것부터 사용해야 하므로 show 변수를 통해 확인한다.
            // idx 는 계속 갱신되므로 show 변수를 따로 사용했다.

            totalCount += 1; // 공격 시도 증가
            show += 1;
            boss -= skillPower[idx]; // 보스 체력 감소
            skillTry[idx] -= 1; // 횟수 1 감소
            set.add(idx); // 사용한 스킬을 set에 추가
            idx += 1;
        }

        if (boss > 0) {
            return new int[]{-1};
        } // 모든 스킬을 사용했는데도 보스의 체력이 0보다 크다면 -1을 배열에 담아서 반환한다.

        return new int[]{set.size(), totalCount};
    }
}