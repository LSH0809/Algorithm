package company;

class Solution4 {
    static boolean[] visited;

    public static void main(String[] args) {
        String[] cards1 = {"S1", "D3", "S3", "S4", "H3", "H1"};
        String[] cards2 = {"C8", "H8", "C7", "C0", "D8", "S8"};
        String[] cards3 = {"H1", "H2", "C9"};

        System.out.println(solution(cards1));
        System.out.println(solution(cards2));
        System.out.println(solution(cards3));
    }

    public static int solution(String[] cards) {
        int answer = -1;
        visited = new boolean[cards.length];

        for (int i = 1; i < cards.length; i++) {
            getCards(0, i, cards, "");
        }
        return answer;
    }
    // 재귀로 모든 경우의 수 반환
    // 재귀 메소드를 통해 값을 얻을 때마다 각 조건에 해당하는지 확인 -> boolean 타입으로 반환
    // boolean이 true일 경우 점수 계산

    private static int check(String str) {
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i += 2) {
//            if(charArr[i])
        }
        return 1;
    }

    private static void getCards(int idx, int n, String[] cards, String temp) {
        if (idx == n) {
            System.out.println("check : " + temp);
            for (int j = 0; j < cards.length; j++) {
                visited[j] = false;
            }
            return;
        }

        for (int i = idx; i < cards.length; i++) {
            if (!visited[i]) {
                String tempStr = temp;
                tempStr += cards[i];
                visited[i] = true;
                getCards(idx + 1, n, cards, tempStr);
                for (int j = i + 1; j < cards.length; j++) {
                    visited[j] = false;
                }
            }
        }
    } // 재귀를 통해 모든 경우의 수 반환
}