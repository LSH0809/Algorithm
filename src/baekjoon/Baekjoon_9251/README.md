## Baekjoon_9251 (LCS) ๐
___


### **[๋ฌธ์  ์ค๋ช]**
<br>

LCS(Longest Common Subsequence, ์ต์ฅ ๊ณตํต ๋ถ๋ถ ์์ด)๋ฌธ์ ๋ ๋ ์์ด์ด ์ฃผ์ด์ก์ ๋, ๋ชจ๋์ ๋ถ๋ถ ์์ด์ด ๋๋ ์์ด ์ค ๊ฐ์ฅ ๊ธด ๊ฒ์ ์ฐพ๋ ๋ฌธ์ ์ด๋ค.

์๋ฅผ ๋ค์ด, ACAYKP์ CAPCAK์ LCS๋ ACAK๊ฐ ๋๋ค.


### **[์๋ ฅ]**
<br>

์ฒซ์งธ ์ค๊ณผ ๋์งธ ์ค์ ๋ ๋ฌธ์์ด์ด ์ฃผ์ด์ง๋ค. ๋ฌธ์์ด์ ์ํ๋ฒณ ๋๋ฌธ์๋ก๋ง ์ด๋ฃจ์ด์ ธ ์์ผ๋ฉฐ, ์ต๋ 1000๊ธ์๋ก ์ด๋ฃจ์ด์ ธ ์๋ค.

### **[์ถ๋ ฅ]**
<br>

์ฒซ์งธ ์ค์ ์๋ ฅ์ผ๋ก ์ฃผ์ด์ง ๋ ๋ฌธ์์ด์ LCS์ ๊ธธ์ด๋ฅผ ์ถ๋ ฅํ๋ค.

___


### **[ํ์ด]**

- LCS (Longest Common Subsequence) ์ฆ, ๋ค์ด๋๋ฏน ํ๋ก๊ทธ๋๋ฐ์ ์ด์ฉํ ์ ํ์ ๋ฌธ์ ์๋๋ค.
- ํต์ฌ์ ์ธ ๋ก์ง ์ฆ ์ ํ์์ ๋ํด์ ํ์์ ํ๋ ๊ฒ์ด ๊ฐ์ฅ ์ค์ํ๋ค
  - dp[i][j] = dp[i-1][j]์ dp[i][j-1]์ ์ต๋๊ฐ ((i-1)๊ณผ (j-1)๋ฒ์งธ ๋ฌธ์์ด์ด ์๋ก ๋ค๋ฅผ ๊ฒฝ์ฐ ์ต๋๊ฐ์ผ๋ก ๊ฐฑ์ )
  - dp[i][j] = dp[i-1][j-1] + 1 ((i-1)๊ณผ (j-1)๋ฒ์งธ ๋ฌธ์์ด์ด ๊ฐ์ ๊ฒฝ์ฐ +1 ํ ๊ฐ์ผ๋ก ๊ฐฑ์ )
- ์ด๋ฅผ 2์ฐจ์ ๋ฐฐ์ด์ ์์ฑํด๋ณด๋ฉด์ ํ๋ฆ์ ์ฐพ๋ ๊ฒ์ด ๊ฐ์ฅ ์ค์ํ๋ค๊ณ  ์๊ฐํ๋ค.
