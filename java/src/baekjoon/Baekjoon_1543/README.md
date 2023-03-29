## Baekjoon_1543 (단어 공부) 🚀
___


### **[문제 설명]**
<br>

세준이는 영어로만 이루어진 어떤 문서를 검색하는 함수를 만들려고 한다. 이 함수는 어떤 단어가 총 몇 번 등장하는지 세려고 한다. 그러나, 세준이의 함수는 중복되어 세는 것은 빼고 세야 한다. 예를 들어, 문서가 abababa이고, 그리고 찾으려는 단어가 ababa라면, 세준이의 이 함수는 이 단어를 0번부터 찾을 수 있고, 2번부터도 찾을 수 있다. 그러나 동시에 셀 수는 없다.

세준이는 문서와 검색하려는 단어가 주어졌을 때, 그 단어가 최대 몇 번 중복되지 않게 등장하는지 구하는 프로그램을 작성하시오.


### **[입력]**
<br>

첫째 줄에 문서가 주어진다. 문서의 길이는 최대 2500이다. 둘째 줄에 검색하고 싶은 단어가 주어진다. 이 길이는 최대 50이다. 문서와 단어는 알파벳 소문자와 공백으로 이루어져 있다.

### **[출력]**
<br>

첫째 줄에 중복되지 않게 최대 몇 번 등장하는지 출력한다.

___


### **[풀이]**

- 처음에 replaceFirst() 메소드를 이용해서 풀었지만, 대체하는 것이 아니라 세야하는 문제였기에 틀렸다.
- 그래서 startsWith() 메소드를 이용하였고 해당하는 문자열이 존재한다면 i 인덱스에 단어의 길이를 더하는 식으로 진행했다.
 