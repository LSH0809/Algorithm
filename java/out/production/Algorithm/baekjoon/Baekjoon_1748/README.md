## Baekjoon_1748 (수 이어 쓰기1) 🚀
___


### **[문제 설명]**
<br>

1부터 N까지의 수를 이어서 쓰면 다음과 같이 새로운 하나의 수를 얻을 수 있다.

1234567891011121314151617181920212223...

이렇게 만들어진 새로운 수는 몇 자리 수일까? 이 수의 자릿수를 구하는 프로그램을 작성하시오.


### **[입력]**
<br>

첫째 줄에 N(1 ≤ N ≤ 100,000,000)이 주어진다.

### **[출력]**
<br>

첫째 줄에 새로운 수의 자릿수를 출력한다.

___


### **[풀이]**

- 수학 및 구현 유형의 문제입니다.
- n의 문자열의 길이는 1 ~ 9 는 1개, 10 ~ 99는 2개, 100~ 999는 3개 이런식으로 증가합니다.  
- 입력받는 변수 n의 숫자의 길이(문자열로 했을 때 길이)는 10, 100, 1000 이렇게 10의 제곱수가 되었을 때 증가합니다.
- 따라서, for문으로 하나씩 확인하며 값을 더하면 됩니다.