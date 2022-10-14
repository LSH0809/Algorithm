package 이것이코딩테스트다.구현.유형별기출문제;

// 문자열 압축
public class Q9 {
    public int solve(String s){
        int answer = s.length();

        // 1개 단위부터 압축 단위를 늘려가며 확인
        for(int i = 1; i < s.length() / 2 + 1; i++){
            String compressed = "";
            // 앞에서부터 i만큼의 문자열 추출
            String prev = s.substring(0,i);
            // 첫 압축때 개수는 1로 설정
            int count = 1;
            // 단위 크기만큼 증가시키며 이전 문자열과 비교
            for(int j = i; j< s.length(); j += i){
                String sub = "";
                for(int k = j; k < j + i; k++){
                    if(k < s.length())
                        sub += s.charAt(k);
                }
                // 이전 문자열과 같다면 압축 횟수 증가
                if(prev.equals(sub))
                    count += 1;
                // 이전 문자열과 다르다면
                else{
                    compressed += count > 2 ? (count + prev) : prev;
                    sub = "";
                    for(int k = j ; k< j + i; k++){
                        if(k < s.length())
                            sub += s.charAt(k);
                    }
                    // 초기화
                    prev = sub;
                    count = 1;
                }
            }
            // 남아있는 문자열에 대해서 처리
            compressed += (count > 2)? count + prev : prev;
            // 만들어지는 압축 문자열이 가장 짧은 것이 정답
            answer = Math.min(compressed.length(), answer);
        }
        return answer;
    }
}
