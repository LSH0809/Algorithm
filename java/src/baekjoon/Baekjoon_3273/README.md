## Baekjoon_3273 (두 수의 합) 🚀
___


### **[문제 설명]**
<br>

n개의 서로 다른 양의 정수 a1, a2, ..., an으로 이루어진 수열이 있다. ai의 값은 1보다 크거나 같고, 1000000보다 작거나 같은 자연수이다. 자연수 x가 주어졌을 때, ai + aj = x (1 ≤ i < j ≤ n)을 만족하는 (ai, aj)쌍의 수를 구하는 프로그램을 작성하시오.


### **[입력]**
<br>

첫째 줄에 수열의 크기 n이 주어진다. 다음 줄에는 수열에 포함되는 수가 주어진다. 셋째 줄에는 x가 주어진다. (1 ≤ n ≤ 100000, 1 ≤ x ≤ 2000000)

### **[출력]**
<br>

문제의 조건을 만족하는 쌍의 개수를 출력한다.

___


### **[풀이]**

- 투포인터 유형의 문제였다. 0번 인덱스에서, 배열의 길이 - 1의 인덱스에서 좁혀오며 비교를 하였다.
- 만약, 합이 x값과 같다면 start 혹은 end를 1 더하거나 뺐다.
- 만약, 합이 x값보다 작다면, start 값을 1 더하고 x값보다 크다면, end 값을 1 뺐다.
- 이렇게 연산과정을 반복하면서 개수를 세면된다.
 