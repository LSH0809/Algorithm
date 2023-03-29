## Baekjoon_1260 (DFS와 BFS) 🚀
___


### **[문제 설명]**
<br>

그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 
단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.


### **[입력]**
<br>

첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.

### **[출력]**
<br>

첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.

___


### **[풀이]**

- 기본적인 DFS와 BFS 구현 문제이다.
- DFS는 스택을 이용해서 구현하였습니다.
- BFS는 큐를 이용해서 구현했습니다.
- 구현하는데 다른 방법도 존재하는데 추가적으로도 구현해볼 계획입니다.
 