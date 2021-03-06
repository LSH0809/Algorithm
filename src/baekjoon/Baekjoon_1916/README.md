## Baekjoon_1916 (최소비용 구하기) 🚀
___


### **[문제 설명]**
<br>

N개의 도시가 있다. 그리고 한 도시에서 출발하여 다른 도시에 도착하는 M개의 버스가 있다. 우리는 A번째 도시에서 B번째 도시까지 가는데 드는 버스 비용을 최소화 시키려고 한다. A번째 도시에서 B번째 도시까지 가는데 드는 최소비용을 출력하여라. 도시의 번호는 1부터 N까지이다.

### **[입력]**
<br>

첫째 줄에 도시의 개수 N(1 ≤ N ≤ 1,000)이 주어지고 둘째 줄에는 버스의 개수 M(1 ≤ M ≤ 100,000)이 주어진다. 그리고 셋째 줄부터 M+2줄까지 다음과 같은 버스의 정보가 주어진다. 먼저 처음에는 그 버스의 출발 도시의 번호가 주어진다. 그리고 그 다음에는 도착지의 도시 번호가 주어지고 또 그 버스 비용이 주어진다. 버스 비용은 0보다 크거나 같고, 100,000보다 작은 정수이다.

그리고 M+3째 줄에는 우리가 구하고자 하는 구간 출발점의 도시번호와 도착점의 도시번호가 주어진다. 출발점에서 도착점을 갈 수 있는 경우만 입력으로 주어진다.

### **[출력]**
<br>

첫째 줄에 출발 도시에서 도착 도시까지 가는데 드는 최소 비용을 출력한다.

___


### **[풀이]**

- 다익스트라 알고리즘의 기본 유형 문제입니다.
- 다익스트라 알고리즘에 대한 개념을 먼저 익히고 풀어보시면 좋을 것같습니다.
- 참고로, 다익스트라 알고리즘은 문제처럼 하나의 정점에서 다른 모든 정점의 최단 경로를 구할 때 사용할 수 있는 알고리즘입니다.
- 우리는 dist 배열에 시작 노드로부터 각 노드까지의 최단 거리를 할당하여 반환하면 되는 것이죠.
- 문제를 푸는데, 다익스트라 알고리즘을 구현하는 외에는 추가적인 조건이나 풀이 방법이 필요하지 않으므로 풀이는 넘어가도록 하겠습니다.
- 이 문제를 시작으로 다양한 다익스트라 알고리즘 문제를 풀어보면 좋을 것 같습니다.