## Baekjoon_2470 (λ μ©μ‘) π
___


### **[λ¬Έμ  μ€λͺ]**
<br>

KOI λΆμ€ κ³Όνμ°κ΅¬μμμλ λ§μ μ’λ₯μ μ°μ± μ©μ‘κ³Ό μμΉΌλ¦¬μ± μ©μ‘μ λ³΄μ νκ³  μλ€. κ° μ©μ‘μλ κ·Έ μ©μ‘μ νΉμ±μ λνλ΄λ νλμ μ μκ° μ£Όμ΄μ Έμλ€.  μ°μ± μ©μ‘μ νΉμ±κ°μ 1λΆν° 1,000,000,000κΉμ§μ μμ μ μλ‘ λνλ΄κ³ , μμΉΌλ¦¬μ± μ©μ‘μ νΉμ±κ°μ -1λΆν° -1,000,000,000κΉμ§μ μμ μ μλ‘ λνλΈλ€.

κ°μ μμ λ μ©μ‘μ νΌν©ν μ©μ‘μ νΉμ±κ°μ νΌν©μ μ¬μ©λ κ° μ©μ‘μ νΉμ±κ°μ ν©μΌλ‘ μ μνλ€. μ΄ μ°κ΅¬μμμλ κ°μ μμ λ μ©μ‘μ νΌν©νμ¬ νΉμ±κ°μ΄ 0μ κ°μ₯ κ°κΉμ΄ μ©μ‘μ λ§λ€λ €κ³  νλ€.

μλ₯Ό λ€μ΄, μ£Όμ΄μ§ μ©μ‘λ€μ νΉμ±κ°μ΄ [-2, 4, -99, -1, 98]μΈ κ²½μ°μλ νΉμ±κ°μ΄ -99μΈ μ©μ‘κ³Ό νΉμ±κ°μ΄ 98μΈ μ©μ‘μ νΌν©νλ©΄ νΉμ±κ°μ΄ -1μΈ μ©μ‘μ λ§λ€ μ μκ³ , μ΄ μ©μ‘μ΄ νΉμ±κ°μ΄ 0μ κ°μ₯ κ°κΉμ΄ μ©μ‘μ΄λ€. μ°Έκ³ λ‘, λ μ’λ₯μ μμΉΌλ¦¬μ± μ©μ‘λ§μΌλ‘λ νΉμ λ μ’λ₯μ μ°μ± μ©μ‘λ§μΌλ‘ νΉμ±κ°μ΄ 0μ κ°μ₯ κ°κΉμ΄ νΌν© μ©μ‘μ λ§λλ κ²½μ°λ μ‘΄μ¬ν  μ μλ€.

μ°μ± μ©μ‘κ³Ό μμΉΌλ¦¬μ± μ©μ‘μ νΉμ±κ°μ΄ μ£Όμ΄μ‘μ λ, μ΄ μ€ λ κ°μ μλ‘ λ€λ₯Έ μ©μ‘μ νΌν©νμ¬ νΉμ±κ°μ΄ 0μ κ°μ₯ κ°κΉμ΄ μ©μ‘μ λ§λ€μ΄λ΄λ λ μ©μ‘μ μ°Ύλ νλ‘κ·Έλ¨μ μμ±νμμ€.


### **[μλ ₯]**
<br>

μ²«μ§Έ μ€μλ μ μ²΄ μ©μ‘μ μ Nμ΄ μλ ₯λλ€. Nμ 2 μ΄μ 100,000 μ΄νμ΄λ€. λμ§Έ μ€μλ μ©μ‘μ νΉμ±κ°μ λνλ΄λ Nκ°μ μ μκ° λΉμΉΈμ μ¬μ΄μ λκ³  μ£Όμ΄μ§λ€. μ΄ μλ€μ λͺ¨λ -1,000,000,000 μ΄μ 1,000,000,000 μ΄νμ΄λ€. Nκ°μ μ©μ‘λ€μ νΉμ±κ°μ λͺ¨λ λ€λ₯΄κ³ , μ°μ± μ©μ‘λ§μΌλ‘λ μμΉΌλ¦¬μ± μ©μ‘λ§μΌλ‘ μλ ₯μ΄ μ£Όμ΄μ§λ κ²½μ°λ μμ μ μλ€.

### **[μΆλ ₯]**
<br>

μ²«μ§Έ μ€μ νΉμ±κ°μ΄ 0μ κ°μ₯ κ°κΉμ΄ μ©μ‘μ λ§λ€μ΄λ΄λ λ μ©μ‘μ νΉμ±κ°μ μΆλ ₯νλ€. μΆλ ₯ν΄μΌ νλ λ μ©μ‘μ νΉμ±κ°μ μ€λ¦μ°¨μμΌλ‘ μΆλ ₯νλ€. νΉμ±κ°μ΄ 0μ κ°μ₯ κ°κΉμ΄ μ©μ‘μ λ§λ€μ΄λ΄λ κ²½μ°κ° λ κ° μ΄μμΌ κ²½μ°μλ κ·Έ μ€ μλ¬΄κ²μ΄λ νλλ₯Ό μΆλ ₯νλ€.

___


### **[νμ΄]**

- μ΄λΆ νμ μ νμ λ¬Έμ μμ΅λλ€. 
- μ΅μκ°μ μ»μ΄μΌ νκΈ° λλ¬Έμ μμ μΈλ±μ€μ λμ μΈλ±μ€μ λ°°μ΄ κ°μ λν κ°κ³Ό μ΄κΈ° κ°μ λΉκ΅νλ κ³Όμ μ λ°λ³΅νμ΅λλ€.
- λ§μ½ μ΄μ κ°λ³΄λ€ μ΅μκ°μΌ κ²½μ°μλ, κ·Έ μμ μ start,end λ³μ κ°μ answer1,answer2 λ³μμ λ΄μμ΅λλ€.
- while λ°λ³΅λ¬Έμ΄ λλ  κ²½μ° λ§μ§λ§μ λ΄κΈ΄ answer1,answer2 λ³μκ°μ μ΄μ©ν΄μ λ΅μ μΆλ ₯ν©λλ€.