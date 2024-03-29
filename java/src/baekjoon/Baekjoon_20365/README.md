## Baekjoon_20365 (블로그2) 🚀
___


### **[문제 설명]**
<br>

neighbor 블로그를 운영하는 일우는 매일 아침 풀고 싶은 문제를 미리 정해놓고 글을 올린다. 그리고 매일 밤 각각의 문제에 대하여, 해결한 경우 파란색, 해결하지 못한 경우 빨간색으로 칠한다. 일우는 각 문제를 칠할 때 아래와 같은 과정을 한 번의 작업으로 수행한다.

1. 연속된 임의의 문제들을 선택한다.
2. 선택된 문제들을 전부 원하는 같은 색으로 칠한다.

일우는 매일 500,000문제까지 시도하기 때문에, 이 작업이 꽤나 귀찮아지기 시작했다. 그래서 가장 효율적인 방법으로 위 작업을 수행하기를 원한다. 일우를 도와 각 문제를 주어진 색으로 칠할 때 필요한 최소한의 작업 횟수를 구하는 프로그램을 작성하라.


### **[입력]**
<br>

첫째 줄에 색을 칠해야 하는 문제의 수 N (1 ≤ N ≤ 500,000)이 주어진다.

둘째 줄에 N개의 문자가 공백 없이 순서대로 주어진다. 각 문자는 i번째 문제를 어떤 색으로 칠해야 하는지를 의미하며, R은 빨간색, B는 파란색을 나타낸다. 그 외에 다른 문자는 주어지지 않는다.

### **[출력]**
<br>

첫째 줄에 일우가 주어진 모든 문제를 원하는 색으로 칠할 때까지 필요한 작업 횟수의 최솟값을 출력하라.

___


### **[풀이]**

- 가장 최소한의 작업 횟수는 처음 하나의 색깔로 칠한 다음, 그 외의 색깔로 해당되는 부분에 칠을 하는 것이다.
- 따라서 List의 크기가 작은 것을 선택하여 해당하는 색깔의 크기를 이용하여 계산을 하면 풀 수 있다.
 