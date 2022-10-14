package company.socar;

/*
배열에서 swap 메소드 호출하면서 인접한 수가 k이하여야함
이때 swap 메소드 호출 최소 횟수

 */
public class Solution2 {
    static int answer, n;

    public static void main(String[] args) {
        int[] numbers1 = new int[]{10, 40, 30, 20};
        int[] numbers2 = new int[]{3, 7, 2, 8, 6, 4, 5, 1};
        int[] numbers3 = new int[]{100};



            System.out.println(solution(numbers3, 1));
            System.out.println(solution(numbers3, 2));
            System.out.println(solution(numbers3, 3));


    }

    public static int solution(int[] numbers, int k) {
        int[] generateNumbers = new int[numbers.length];
        answer = Integer.MAX_VALUE;
        n = numbers.length;

        getCases(numbers, generateNumbers, 0, 0, k);
        if (answer == Integer.MAX_VALUE) {
            answer = -1;
        }
        return answer;
    }

    public static void getCases(int[] rawArr, int[] generateNumbers, int count, int flag, int k) {
        if (count == n) {
//            System.out.println(Arrays.toString(generateNumbers));
            if (isProper(generateNumbers, k)) {
                answer = Math.min(answer, check(rawArr, generateNumbers));
            }
            return;
        }
        for (int i = 0; i < n; i++) {
            if ((flag & 1 << i) != 0) {
                continue;
            }
            generateNumbers[count] = rawArr[i];
            getCases(rawArr, generateNumbers, count + 1, (flag | 1 << i), k);
        }
    }

    private static boolean isProper(int[] arr, int k) {
        boolean flag = true;
        if (arr.length > 2) {
            for (int i = 1; i < arr.length - 1; i++) {
                if (Math.abs(arr[i - 1] - arr[i]) > k) {
                    flag = false;
                    break;
                }
                if (Math.abs(arr[i + 1] - arr[i]) > k) {
                    flag = false;
                    break;
                }
            }
        }
        if (arr.length == 2) {
            if (Math.abs(arr[1] - arr[0]) > k) {
                flag = false;
            }
        }
        if (arr.length == 1) {
            if (arr[0] > k) {
                flag = false;
            }
        }

        return flag;
    }

    private static int check(int[] rawArr, int[] calArr) {
        int count = 0;
        for (int i = 0; i < rawArr.length; i++) {
            if (rawArr[i] != calArr[i]) {
                count += 1;
            }
        }

        if (count % 2 == 1) {
            return (count / 2) + 1;
        }
        return count / 2;
    }
}
