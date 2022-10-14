package company.fasto;

import java.util.ArrayList;

public class Solution3 {
    public static void main(String[] args) {
        int x = -1;
        int y = 2;
        int r = 2;
        int d = 60;
        int [][] target = {{0, 1}, {-1, 1}, {1, 0}, {-2, 2}};

        System.out.println(solution(x,y,r,d, target));
    }

    static int solution(int x, int y, int r, int d, int[][] target) {
        ArrayList<int[]> inList = new ArrayList<>();
        int answer = 0;
        for (int[] targetPosition : target) {
            if (getDistance(targetPosition[0], targetPosition[1]) <= r) {
                inList.add(targetPosition);
            }
        }

        for(int i = 0; i< inList.size();i++){
            double value1 = getVectorSize(x,y);
            double value2 = getVectorSize(inList.get(i)[0],inList.get(i)[1]);

            double innerSize = getInnerSize(x,y,inList.get(i)[0],inList.get(i)[1]);

            double radianValue = Math.acos(innerSize / (value1*value2));
            // Math.acos() 메소드는 역코사인값 반환

            if(Math.toDegrees(radianValue) <= d){
                answer += 1;
            }// radianValue 값을 '도'로 변환시켜주기 위해 Math.toDegrees() 메소드 활용
        }
        return answer;
    }

    private static double getDistance(int x, int y){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
    // 목표 좌표 위치와의 길이를 반환 (피타고라스 정리 이용)

    private static double getVectorSize(double x, double y){
        return Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
    }// 벡터의 크기 구하는 공식 -> 2차원 공간에서는 피타고라스의 정리가 적용가능하다.

    private static double getInnerSize(double x1, double x2, double y1, double y2){
        return (x1*y1) + (x2*y2);
    }// 벡터의 곱셈 -> 내적 이용 -> 따라서 x1 * y1과 x2 * y2의 합 이용
}

/*
    좌표가 부채꼴 내부에 있는지 판단

    점수
    25 / 25

 */