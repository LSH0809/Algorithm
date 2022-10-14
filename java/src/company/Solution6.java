package company;

import java.util.Locale;

public class Solution6 {
    public static void main(String[] args) {
        String p = "<<<><";

        System.out.println(solution(p));
    }
    public static int solution(String p) {
        int answer = 0;

        char[] arr = p.toCharArray();

        for(int i = 0; i< p.length(); i++){
            int idx = i;
            int tryCount = 0;
            while(true){
                tryCount += 1;
                if(arr[idx] == '<'){
                    idx -= 1;
                }else{
                    idx += 1;
                }

                if(idx < 0 || idx >= arr.length){
                    answer += 1;
                    break;
                }
                if (tryCount > 200000) {
                    break;
                }
            }
        }

        return answer;
    }
}
