## Baekjoon_2606 (๋ฐ์ด๋ฌ์ค) ๐
___


### **[๋ฌธ์  ์ค๋ช]**
<br>

์ ์ข ๋ฐ์ด๋ฌ์ค์ธ ์ ๋ฐ์ด๋ฌ์ค๋ ๋คํธ์ํฌ๋ฅผ ํตํด ์ ํ๋๋ค. ํ ์ปดํจํฐ๊ฐ ์ ๋ฐ์ด๋ฌ์ค์ ๊ฑธ๋ฆฌ๋ฉด ๊ทธ ์ปดํจํฐ์ ๋คํธ์ํฌ ์์์ ์ฐ๊ฒฐ๋์ด ์๋ ๋ชจ๋  ์ปดํจํฐ๋ ์ ๋ฐ์ด๋ฌ์ค์ ๊ฑธ๋ฆฌ๊ฒ ๋๋ค.

์๋ฅผ ๋ค์ด 7๋์ ์ปดํจํฐ๊ฐ <๊ทธ๋ฆผ 1>๊ณผ ๊ฐ์ด ๋คํธ์ํฌ ์์์ ์ฐ๊ฒฐ๋์ด ์๋ค๊ณ  ํ์. 1๋ฒ ์ปดํจํฐ๊ฐ ์ ๋ฐ์ด๋ฌ์ค์ ๊ฑธ๋ฆฌ๋ฉด ์ ๋ฐ์ด๋ฌ์ค๋ 2๋ฒ๊ณผ 5๋ฒ ์ปดํจํฐ๋ฅผ ๊ฑฐ์ณ 3๋ฒ๊ณผ 6๋ฒ ์ปดํจํฐ๊น์ง ์ ํ๋์ด 2, 3, 5, 6 ๋ค ๋์ ์ปดํจํฐ๋ ์ ๋ฐ์ด๋ฌ์ค์ ๊ฑธ๋ฆฌ๊ฒ ๋๋ค. ํ์ง๋ง 4๋ฒ๊ณผ 7๋ฒ ์ปดํจํฐ๋ 1๋ฒ ์ปดํจํฐ์ ๋คํธ์ํฌ์์์ ์ฐ๊ฒฐ๋์ด ์์ง ์๊ธฐ ๋๋ฌธ์ ์ํฅ์ ๋ฐ์ง ์๋๋ค.

์ด๋ ๋  1๋ฒ ์ปดํจํฐ๊ฐ ์ ๋ฐ์ด๋ฌ์ค์ ๊ฑธ๋ ธ๋ค. ์ปดํจํฐ์ ์์ ๋คํธ์ํฌ ์์์ ์๋ก ์ฐ๊ฒฐ๋์ด ์๋ ์ ๋ณด๊ฐ ์ฃผ์ด์ง ๋, 1๋ฒ ์ปดํจํฐ๋ฅผ ํตํด ์ ๋ฐ์ด๋ฌ์ค์ ๊ฑธ๋ฆฌ๊ฒ ๋๋ ์ปดํจํฐ์ ์๋ฅผ ์ถ๋ ฅํ๋ ํ๋ก๊ทธ๋จ์ ์์ฑํ์์ค.

### **[์๋ ฅ]**
<br>

์ฒซ์งธ ์ค์๋ ์ปดํจํฐ์ ์๊ฐ ์ฃผ์ด์ง๋ค. ์ปดํจํฐ์ ์๋ 100 ์ดํ์ด๊ณ  ๊ฐ ์ปดํจํฐ์๋ 1๋ฒ ๋ถํฐ ์ฐจ๋ก๋๋ก ๋ฒํธ๊ฐ ๋งค๊ฒจ์ง๋ค. ๋์งธ ์ค์๋ ๋คํธ์ํฌ ์์์ ์ง์  ์ฐ๊ฒฐ๋์ด ์๋ ์ปดํจํฐ ์์ ์๊ฐ ์ฃผ์ด์ง๋ค. ์ด์ด์ ๊ทธ ์๋งํผ ํ ์ค์ ํ ์์ฉ ๋คํธ์ํฌ ์์์ ์ง์  ์ฐ๊ฒฐ๋์ด ์๋ ์ปดํจํฐ์ ๋ฒํธ ์์ด ์ฃผ์ด์ง๋ค.

### **[์ถ๋ ฅ]**
<br>

1๋ฒ ์ปดํจํฐ๊ฐ ์ ๋ฐ์ด๋ฌ์ค์ ๊ฑธ๋ ธ์ ๋, 1๋ฒ ์ปดํจํฐ๋ฅผ ํตํด ์ ๋ฐ์ด๋ฌ์ค์ ๊ฑธ๋ฆฌ๊ฒ ๋๋ ์ปดํจํฐ์ ์๋ฅผ ์ฒซ์งธ ์ค์ ์ถ๋ ฅํ๋ค.

___


### **[ํ์ด]**
- ์ฌ๊ท๋ฅผ ์ด์ฉํ์ฌ DFS ๋ฐฉ์์ผ๋ก ํ์์ต๋๋ค. (BFS๋ฐฉ์์ผ๋ก ํ์ด๋ ๋ฉ๋๋ค.)
- ๊ธฐ๋ณธ์ ์ผ๋ก ๋ฐฐ์ด์ ๊ฐ์ด 1์ด๋ฉด์, ๋ฐฉ๋ฌธํ์ง ์์ ๊ณณ์ ๊ธฐ์ค์ผ๋ก DFS๋ฅผ ์ฌ์ฉํฉ๋๋ค.
- ๋ฉ์๋์ ๋งค๊ฐ๋ณ์์ธ idx๋ฅผ ๋ฉ์๋ ํธ์ถํ๊ฒ ๋๋ฉด, ๋ฐฉ๋ฌธํ ๊ฒ์ผ๋ก ๊ธฐ๋กํฉ๋๋ค.
- ๊ทธ๋ฆฌ๊ณ  ์ ์ฒด ๋ธ๋์ค ํ์ฌ ์์น์ ์ปดํจํฐ์ ์ฐ๊ฒฐ๋์ด ์์ผ๋ฉฐ, ๋ฐฉ๋ฌธํ์ง ์์ผ๋ฉด ๋ฉ์๋๋ฅผ ์ฌ๊ท์ ์ผ๋ก ํธ์ถํฉ๋๋ค.
  - ๋ํ, ์ปดํจํฐ์ ์๋ฅผ ์ธ๊ธฐ ์ํด ๋ฉ์๋ ํธ์ถ๋  ๋๋ง๋ค count ๋ณ์์ 1์ ๋ํฉ๋๋ค.
  - ์ฒ์ ๋ฉ์๋๋ฅผ ํธ์ถํ  ๋๋ 1๋ฒ ์ปดํจํฐ๊ฐ ํฌํจ๋์ง ์์ผ๋ฏ๋ก count ๋ณ์ ๊ฒฐ๊ณผ๊ฐ๋ง ๋ฐํํ๋ฉด ๋ฉ๋๋ค.