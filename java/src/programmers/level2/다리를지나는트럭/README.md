## Programmers_방문길이 (방문 길이) 🚀
___



### **[풀이]**

- 큐 관련 유형의 구현 문제입니다.
- 제가 문제를 이해하지 못해 좀 시간이 걸렸는데 혹시 저와 같은 분들이 계실까 남깁니다.
  - 다리의 길이가 3일 경우 트럭은 다리를 처음부터 지나는데 3초가 걸리는 것입니다.
  - 저는 단순히 1초 걸리겠지? 라고 생각해서.. 오래걸렸던..
- 어쨌든, while 반복문을 이용해 트럭이 다 지날때까지 반복합니다.
- 만약 큐의 길이가 다리 길이와 같다면 큐에서 값을 꺼내줍니다.
- 그리고 다리에 올라가있는 트럭 무게 + 올라가야하는 트럭의 무게가 다리가 버틸수 있는 무게보다 크다면,
  - queue에 0을 추가 및 1초 늘립니다.
- 위 경우를 제외하면 다리에 틀럭이 올라가는 것을 구현해줍니다.
