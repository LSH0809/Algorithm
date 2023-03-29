## Baekjoon_17086 (아기 상어2)(재풀이) 🚀
___


### **[문제 설명]**
<br>

N×M 크기의 공간에 아기 상어 여러 마리가 있다. 공간은 1×1 크기의 정사각형 칸으로 나누어져 있다. 한 칸에는 아기 상어가 최대 1마리 존재한다.

어떤 칸의 안전 거리는 그 칸과 가장 거리가 가까운 아기 상어와의 거리이다. 두 칸의 거리는 하나의 칸에서 다른 칸으로 가기 위해서 지나야 하는 칸의 수이고, 이동은 인접한 8방향(대각선 포함)이 가능하다.

안전 거리가 가장 큰 칸을 구해보자.


### **[입력]**
<br>

첫째 줄에 공간의 크기 N과 M(2 ≤ N, M ≤ 50)이 주어진다. 둘째 줄부터 N개의 줄에 공간의 상태가 주어지며, 0은 빈 칸, 1은 아기 상어가 있는 칸이다. 빈 칸의 개수가 한 개 이상인 입력만 주어진다.

### **[출력]**
<br>

첫째 줄에 안전 거리의 최댓값을 출력한다.

___


### **[풀이]**
- BFS를 이용해서 풀었습니다.
- 시작점을 큐에 넣은 이후, dis 배열에 거리에 대한 최소값을 저장하면서 계산합니다.
- 입력값을 받을 때 1이 있는 곳이 아기상어가 있는 칸이므로, 처음에 이 부분에 대해서만 큐에 담습니다.

 