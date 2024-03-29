## Baekjoon_2292 (벌집) 🚀
___


### **[문제 설명]**
<br>

위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 예를 들면, 13까지는 3개, 58까지는 5개를 지난다.


### **[입력]**
<br>

첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.


### **[출력]**
<br>

입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.

___


### **[풀이]**

- 구현 및 규칙과 관련한 문제였습니다.
- 입력받는 수가 어떠한 범위에 있는지를 토대로 몇층에 있는지 계산하여야 합니다.
- 1이 입력되면 1개의 방을 지난다고 출력해야 합니다.
  - 2부터 7까지는 2층에 있으며 2층에는 총 6개의 벌집이 있습니다.
  - 8부터 19까지는 3층에 있으며 3층에는 총 12개의 벌집이 있습니다.
  - 20부터 37까지는 4층에 있으며 4층에는 총 18개의 벌집이 있습니다.
  - 38부터 61까지는 5층에 있으며 5층에는 총 24개의 벌집이 있습니다.
- 즉, 입력받는 수가 어느 범위에 속한느지 알게된다면 해당하는 층을 반환하면 됩니다.
- 그러므로, 층을 계산하는 count 변수를 하나씩 더하며 현재 층의 벌집의 개수 변수(num)를 전체 벌집 개수(totalNum)변수에 더하며 조건식을 진행하면 됩니다.