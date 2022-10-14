package company;

class Solution5 {
    public static int solution(int mod1, int mod2, int max_range) {
        int answer = 0;

        for (int i = 0; i < max_range + 1; i+= mod1) {
            if (i % mod2 != 0) {
                answer += 1;
            }
        }

        return answer;
    }
    private int gcd(int a, int b){
        if(a % b == 0){
            return b;
        }
        return gcd(b, a % b);
    }

    private int lcd(int a, int b){
        return a * b / gcd(a,b);
    }

    public static void main(String[] args) {
        int mod11 = 4;
        int mod12 = 3;
        int mod21 = 3;
        int mod22 = 4;
        int max_range = 20;

        System.out.println(solution(mod11, mod12, max_range));
        System.out.println(solution(mod21, mod22, max_range));
    }

//    public static int solution(int mod1, int mod2, int max_range) {
//        int answer = 0;
//
//        for (int i = 1; i < max_range + 1; i++) {
//            if (i % mod1 == 0 && i % mod2 != 0) {
//                answer += 1;
//            }
//        }
//
//        return answer;
//    }
}