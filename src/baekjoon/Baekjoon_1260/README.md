## Baekjoon_1260 (DFS์ BFS) ๐
___


### **[๋ฌธ์  ์ค๋ช]**
<br>

๊ทธ๋ํ๋ฅผ DFS๋ก ํ์ํ ๊ฒฐ๊ณผ์ BFS๋ก ํ์ํ ๊ฒฐ๊ณผ๋ฅผ ์ถ๋ ฅํ๋ ํ๋ก๊ทธ๋จ์ ์์ฑํ์์ค. 
๋จ, ๋ฐฉ๋ฌธํ  ์ ์๋ ์ ์ ์ด ์ฌ๋ฌ ๊ฐ์ธ ๊ฒฝ์ฐ์๋ ์ ์  ๋ฒํธ๊ฐ ์์ ๊ฒ์ ๋จผ์  ๋ฐฉ๋ฌธํ๊ณ , ๋ ์ด์ ๋ฐฉ๋ฌธํ  ์ ์๋ ์ ์ด ์๋ ๊ฒฝ์ฐ ์ข๋ฃํ๋ค. ์ ์  ๋ฒํธ๋ 1๋ฒ๋ถํฐ N๋ฒ๊น์ง์ด๋ค.


### **[์๋ ฅ]**
<br>

์ฒซ์งธ ์ค์ ์ ์ ์ ๊ฐ์ N(1 โค N โค 1,000), ๊ฐ์ ์ ๊ฐ์ M(1 โค M โค 10,000), ํ์์ ์์ํ  ์ ์ ์ ๋ฒํธ V๊ฐ ์ฃผ์ด์ง๋ค. ๋ค์ M๊ฐ์ ์ค์๋ ๊ฐ์ ์ด ์ฐ๊ฒฐํ๋ ๋ ์ ์ ์ ๋ฒํธ๊ฐ ์ฃผ์ด์ง๋ค. ์ด๋ค ๋ ์ ์  ์ฌ์ด์ ์ฌ๋ฌ ๊ฐ์ ๊ฐ์ ์ด ์์ ์ ์๋ค. ์๋ ฅ์ผ๋ก ์ฃผ์ด์ง๋ ๊ฐ์ ์ ์๋ฐฉํฅ์ด๋ค.

### **[์ถ๋ ฅ]**
<br>

์ฒซ์งธ ์ค์ DFS๋ฅผ ์ํํ ๊ฒฐ๊ณผ๋ฅผ, ๊ทธ ๋ค์ ์ค์๋ BFS๋ฅผ ์ํํ ๊ฒฐ๊ณผ๋ฅผ ์ถ๋ ฅํ๋ค. V๋ถํฐ ๋ฐฉ๋ฌธ๋ ์ ์ ์์๋๋ก ์ถ๋ ฅํ๋ฉด ๋๋ค.

___


### **[ํ์ด]**

- ๊ธฐ๋ณธ์ ์ธ DFS์ BFS ๊ตฌํ ๋ฌธ์ ์ด๋ค.
- DFS๋ ์คํ์ ์ด์ฉํด์ ๊ตฌํํ์์ต๋๋ค.
- BFS๋ ํ๋ฅผ ์ด์ฉํด์ ๊ตฌํํ์ต๋๋ค.
- ๊ตฌํํ๋๋ฐ ๋ค๋ฅธ ๋ฐฉ๋ฒ๋ ์กด์ฌํ๋๋ฐ ์ถ๊ฐ์ ์ผ๋ก๋ ๊ตฌํํด๋ณผ ๊ณํ์๋๋ค.
 