## Baekjoon_11656 (접미사 배열) 🚀
___


### **[문제 설명]**
<br>

접미사 배열은 문자열 S의 모든 접미사를 사전순으로 정렬해 놓은 배열이다.

baekjoon의 접미사는 baekjoon, aekjoon, ekjoon, kjoon, joon, oon, on, n 으로 총 8가지가 있고, 이를 사전순으로 정렬하면, aekjoon, baekjoon, ekjoon, joon, kjoon, n, on, oon이 된다.

문자열 S가 주어졌을 때, 모든 접미사를 사전순으로 정렬한 다음 출력하는 프로그램을 작성하시오.

### **[입력]**
<br>

첫째 줄에 문자열 S가 주어진다. S는 알파벳 소문자로만 이루어져 있고, 길이는 1,000보다 작거나 같다.

### **[출력]**
<br>

첫째 줄부터 S의 접미사를 사전순으로 한 줄에 하나씩 출력한다.

___


### **[풀이]**

- 문자열을 substring() 메소드를 이용하여 분리하는 것이 첫번째, 이후 정렬하여 출력하는 두번째 단계로 이루어져 있다.
- 아무래도 substring()의 인덱스만 신경쓰면 정렬은 문제되지 않을 것 같다.