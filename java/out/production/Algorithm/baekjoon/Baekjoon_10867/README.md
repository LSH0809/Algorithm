## Baekjoon_10867 (중복 빼고 정렬하기) 🚀
___


### **[문제 설명]**
<br>

N개의 정수가 주어진다. 이때, N개의 정수를 오름차순으로 정렬하는 프로그램을 작성하시오. 같은 정수는 한 번만 출력한다.

### **[입력]**
<br>

첫째 줄에 수의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다.

### **[출력]**
<br>

첫째 줄에 수를 오름차순으로 정렬한 결과를 출력한다. 이때, 같은 수는 한 번만 출력한다.

___


### **[풀이]**

- 중복을 없애면 되므로 HashSet 자료구조를 이용했다.
- Set을 배열로 변환하여 정렬을 해서 답을 반환했다.