## Baekjoon_20365 (๋ธ๋ก๊ทธ2) ๐
___


### **[๋ฌธ์  ์ค๋ช]**
<br>

neighbor ๋ธ๋ก๊ทธ๋ฅผ ์ด์ํ๋ ์ผ์ฐ๋ ๋งค์ผ ์์นจ ํ๊ณ  ์ถ์ ๋ฌธ์ ๋ฅผ ๋ฏธ๋ฆฌ ์ ํด๋๊ณ  ๊ธ์ ์ฌ๋ฆฐ๋ค. ๊ทธ๋ฆฌ๊ณ  ๋งค์ผ ๋ฐค ๊ฐ๊ฐ์ ๋ฌธ์ ์ ๋ํ์ฌ, ํด๊ฒฐํ ๊ฒฝ์ฐ ํ๋์, ํด๊ฒฐํ์ง ๋ชปํ ๊ฒฝ์ฐ ๋นจ๊ฐ์์ผ๋ก ์น ํ๋ค. ์ผ์ฐ๋ ๊ฐ ๋ฌธ์ ๋ฅผ ์น ํ  ๋ ์๋์ ๊ฐ์ ๊ณผ์ ์ ํ ๋ฒ์ ์์์ผ๋ก ์ํํ๋ค.

1. ์ฐ์๋ ์์์ ๋ฌธ์ ๋ค์ ์ ํํ๋ค.
2. ์ ํ๋ ๋ฌธ์ ๋ค์ ์ ๋ถ ์ํ๋ ๊ฐ์ ์์ผ๋ก ์น ํ๋ค.

์ผ์ฐ๋ ๋งค์ผ 500,000๋ฌธ์ ๊น์ง ์๋ํ๊ธฐ ๋๋ฌธ์, ์ด ์์์ด ๊ฝค๋ ๊ท์ฐฎ์์ง๊ธฐ ์์ํ๋ค. ๊ทธ๋์ ๊ฐ์ฅ ํจ์จ์ ์ธ ๋ฐฉ๋ฒ์ผ๋ก ์ ์์์ ์ํํ๊ธฐ๋ฅผ ์ํ๋ค. ์ผ์ฐ๋ฅผ ๋์ ๊ฐ ๋ฌธ์ ๋ฅผ ์ฃผ์ด์ง ์์ผ๋ก ์น ํ  ๋ ํ์ํ ์ต์ํ์ ์์ ํ์๋ฅผ ๊ตฌํ๋ ํ๋ก๊ทธ๋จ์ ์์ฑํ๋ผ.


### **[์๋ ฅ]**
<br>

์ฒซ์งธ ์ค์ ์์ ์น ํด์ผ ํ๋ ๋ฌธ์ ์ ์ N (1 โค N โค 500,000)์ด ์ฃผ์ด์ง๋ค.

๋์งธ ์ค์ N๊ฐ์ ๋ฌธ์๊ฐ ๊ณต๋ฐฑ ์์ด ์์๋๋ก ์ฃผ์ด์ง๋ค. ๊ฐ ๋ฌธ์๋ i๋ฒ์งธ ๋ฌธ์ ๋ฅผ ์ด๋ค ์์ผ๋ก ์น ํด์ผ ํ๋์ง๋ฅผ ์๋ฏธํ๋ฉฐ, R์ ๋นจ๊ฐ์, B๋ ํ๋์์ ๋ํ๋ธ๋ค. ๊ทธ ์ธ์ ๋ค๋ฅธ ๋ฌธ์๋ ์ฃผ์ด์ง์ง ์๋๋ค.

### **[์ถ๋ ฅ]**
<br>

์ฒซ์งธ ์ค์ ์ผ์ฐ๊ฐ ์ฃผ์ด์ง ๋ชจ๋  ๋ฌธ์ ๋ฅผ ์ํ๋ ์์ผ๋ก ์น ํ  ๋๊น์ง ํ์ํ ์์ ํ์์ ์ต์๊ฐ์ ์ถ๋ ฅํ๋ผ.

___


### **[ํ์ด]**

- ๊ฐ์ฅ ์ต์ํ์ ์์ ํ์๋ ์ฒ์ ํ๋์ ์๊น๋ก ์น ํ ๋ค์, ๊ทธ ์ธ์ ์๊น๋ก ํด๋น๋๋ ๋ถ๋ถ์ ์น ์ ํ๋ ๊ฒ์ด๋ค.
- ๋ฐ๋ผ์ List์ ํฌ๊ธฐ๊ฐ ์์ ๊ฒ์ ์ ํํ์ฌ ํด๋นํ๋ ์๊น์ ํฌ๊ธฐ๋ฅผ ์ด์ฉํ์ฌ ๊ณ์ฐ์ ํ๋ฉด ํ ์ ์๋ค.
 