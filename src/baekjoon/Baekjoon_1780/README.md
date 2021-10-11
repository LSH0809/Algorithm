## Baekjoon_1780 (종이의 개수) 🚀
___


### **[문제 설명]**
<br>

N×N크기의 행렬로 표현되는 종이가 있다. 종이의 각 칸에는 -1, 0, 1 중 하나가 저장되어 있다. 우리는 이 행렬을 다음과 같은 규칙에 따라 적절한 크기로 자르려고 한다.

1. 만약 종이가 모두 같은 수로 되어 있다면 이 종이를 그대로 사용한다.
2. (1)이 아닌 경우에는 종이를 같은 크기의 종이 9개로 자르고, 각각의 잘린 종이에 대해서 (1)의 과정을 반복한다.
이와 같이 종이를 잘랐을 때, -1로만 채워진 종이의 개수, 0으로만 채워진 종이의 개수, 1로만 채워진 종이의 개수를 구해내는 프로그램을 작성하시오.


### **[입력]**
<br>

첫째 줄에 N(1 ≤ N ≤ 37, N은 3k 꼴)이 주어진다. 다음 N개의 줄에는 N개의 정수로 행렬이 주어진다.


### **[출력]**
<br>

첫째 줄에 -1로만 채워진 종이의 개수를, 둘째 줄에 0으로만 채워진 종이의 개수를, 셋째 줄에 1로만 채워진 종이의 개수를 출력한다.

___


### **[풀이]**

- '쿼드 트리' 방식을 이용하여 풀 수 있는 문제입니다.(이전에 4개의 공간으로 분할해서 푸는 문제를 의미하여 쿼드트리이지만 이번에는 9개로 분할해서 푸는 문제입니다.)
- N은 3의 제곱수 이기 때문에 계속 9개로 분리를 할 수 있으며 최종적으로는 1개로 분리가 됩니다.
- 9개의 영역으로 나누어야 하기 때문에 각 나눠진 것은 원래 크기의 3분의 1 크기로 감소합니다.
- check() 메소드를 통해 2차원 배열 내부에 다른 원소들이 있을 경우 false를 반환하며, 같을 경우 true를 반환합니다.
- check() 메소드를 통해 true가 반환될 경우, one, zero, minusOne 변수 각각 개수를 세면 됩니다.