package company.openSurvery;

public class Solution3 {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 11;

        System.out.println(solution(n1));
        System.out.println(solution(n2));
    }

    public static long solution(long n) {
        long answer = 0;
        long[] dp = new long[(int) (n + 1)];
        int count = 0;
        for(int i = 1; i< 21; i++){
            count += 1;
            for(int r = 1; r < i + 1; r++){
                count += combinationCount(i,r);
            }
            System.out.println("count : " + count);
            if(n < count){
                System.out.println("check : " + Math.pow(3, i));
                break;
            }
            if(n == count){
                System.out.println("answer");
            }

            if(count == n){
                return 1;
            }
        }
        return 1;
    }

    public static double beforePowNumber(long n){
        int idx = 0;
        while(true){
            double pow = Math.pow(3, idx);
            idx += 1;
            if(pow > n){
                break;
            }
        }
        return 2;
    }

    public static long combinationCount(long n, long r){
        long count = 0;
        if(n == r){
            return 1;
        }
        for(int i = 0; i< r + 1; i++){
            count += factorial(n) / (factorial(n - r) * factorial(r));
        }

        return count;
    }

    public static long factorial(long n){
        if(n <= 1){
            return n;
        }else{
            return factorial(n - 1) * n;
        }
    }
}

/*
3의 제곱수 영상
1 3 9 27 등등 에서
사이에 3의 제곱수끼리의 합도 위치
n은 100억까지
n번째 수는 뭐임?
 */