## Baekjoon_1015 (μμ΄ μ λ ¬) π
___


### **[λ¬Έμ  μ€λͺ]**
<br>

P[0], P[1], ...., P[N-1]μ 0λΆν° N-1κΉμ§(ν¬ν¨)μ μλ₯Ό ν λ²μ© ν¬ν¨νκ³  μλ μμ΄μ΄λ€. μμ΄ Pλ₯Ό κΈΈμ΄κ° NμΈ λ°°μ΄ Aμ μ μ©νλ©΄ κΈΈμ΄κ° NμΈ λ°°μ΄ Bκ° λλ€. μ μ©νλ λ°©λ²μ B[P[i]] = A[i]μ΄λ€.

λ°°μ΄ Aκ° μ£Όμ΄μ‘μ λ, μμ΄ Pλ₯Ό μ μ©ν κ²°κ³Όκ° λΉλ΄λ¦Όμ°¨μμ΄ λλ μμ΄μ μ°Ύλ νλ‘κ·Έλ¨μ μμ±νμμ€. λΉλ΄λ¦Όμ°¨μμ΄λ, κ°κ°μ μμκ° λ°λ‘ μμ μλ μμλ³΄λ€ ν¬κ±°λ κ°μ κ²½μ°λ₯Ό λ§νλ€. λ§μ½ κ·Έλ¬ν μμ΄μ΄ μ¬λ¬κ°λΌλ©΄ μ¬μ μμΌλ‘ μμλ κ²μ μΆλ ₯νλ€.


### **[μλ ₯]**
<br>

μ²«μ§Έ μ€μ λ°°μ΄ Aμ ν¬κΈ° Nμ΄ μ£Όμ΄μ§λ€. λμ§Έ μ€μλ λ°°μ΄ Aμ μμκ° 0λ²λΆν° μ°¨λ‘λλ‘ μ£Όμ΄μ§λ€. Nμ 50λ³΄λ€ μκ±°λ κ°μ μμ°μμ΄κ³ , λ°°μ΄μ μμλ 1,000λ³΄λ€ μκ±°λ κ°μ μμ°μμ΄λ€.

### **[μΆλ ₯]**
<br>

μ²«μ§Έ μ€μ λΉλ΄λ¦Όμ°¨μμΌλ‘ λ§λλ μμ΄ Pλ₯Ό μΆλ ₯νλ€.

___


### **[νμ΄]**

- μ λ ¬ μ νμ λ¬Έμ μλλ€.
  - μ΄ν΄κ° μμ§ μλμ  λΆλ€μ μν΄, 500 100 200 300 μΌ λ λ΅μ 3 0 1 2κ° λμμΌ ν©λλ€.
  - μ λ ¬μ νμ λ, 100 200 300 500 μ μμκ° λ©λλ€. μ΄ λ, κ° μΈλ±μ€λ 0, 1, 2, 3μ΄ λκ³  μ²μ μλ ₯λ°λ κ°μ μμλλ‘ λμ΄νμ λ 3 0 1 2 κ° λμ€κ² λ©λλ€.
- μ²μμλ Mapμ μ΄μ©ν΄μ λ΅μ λ΄μΌλ € νμ§λ§, λ§μ½ 500 100 100 200 300 μΌ κ²½μ°, μ€λ³΅λλ κ°μ΄ μμ΄ μ μ νμ§ μμ΅λλ€.
- λ°λΌμ, κ·Έλ₯ λ¬Έμ μ λμμλ λ°©μμΌλ‘ νλ©΄ λ©λλ€.
- λ¬Έμ μ B[P[i]] = A[i]λΌκ³  μ΄λ»κ² νμ΄μΌ νλμ§ λμ μμ΅λλ€.
- μ°λ¦¬κ° ν΄μΌν  κ²μ μ λ ¬μλλ€.
- μ λ λλ€μμ μ΄μ©ν΄μ Arrays.sort()μ μ λ ¬ λ°©μμ λ³κ²½νμ΅λλ€.
- μ΄ν, λ΅μ μ°¨λ‘λλ‘ λμ΄νμ΅λλ€.