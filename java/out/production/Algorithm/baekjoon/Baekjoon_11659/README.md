## Baekjoon_11656 (접미사 배열) 🚀
___


### **[문제 설명]**
<br>

수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.

### **[입력]**
<br>

첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.

### **[출력]**
<br>

총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.

___


### **[풀이]**

- 누적합 유형의 문제입니다.
- 누적합 알고리즘에 대한 이해가 필요합니다.
  - 만약, 단순 for 반복문으로 해결하려한다면, 시간초과가 발생할 것입니다.
- 값을 입력받을 때부터 배열에 누적된 합을 할당합니다.
- 출력을 할 때는 (기준 인덱스) 까지의 배열값에서 (시작값 - 1) 인덱스를 이용하여 배열값을 반환합니다.