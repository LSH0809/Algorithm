## Baekjoon_11720 (숫자의 합) 🚀
___


### **[문제 설명]**
<br>

영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.

### **[입력]**
<br>

첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 띄어쓰기 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열의 앞과 뒤에는 공백이 있을 수도 있다.

### **[출력]**
<br>

첫째 줄에 단어의 개수를 출력한다.

___


### **[풀이]**

- toCharArray() 메소드를 char 배열을 만든 후, 각각의 값을 int형으로 변환하여 더하면 된다.
 