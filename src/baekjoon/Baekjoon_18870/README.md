## Baekjoon_18870 (์ขํ ์์ถ) ๐
___


### **[๋ฌธ์  ์ค๋ช]**
<br>

์์ง์  ์์ N๊ฐ์ ์ขํ X1, X2, ..., XN์ด ์๋ค. ์ด ์ขํ์ ์ขํ ์์ถ์ ์ ์ฉํ๋ ค๊ณ  ํ๋ค.

Xi๋ฅผ ์ขํ ์์ถํ ๊ฒฐ๊ณผ X'i์ ๊ฐ์ Xi > Xj๋ฅผ ๋ง์กฑํ๋ ์๋ก ๋ค๋ฅธ ์ขํ์ ๊ฐ์์ ๊ฐ์์ผ ํ๋ค.

X1, X2, ..., XN์ ์ขํ ์์ถ์ ์ ์ฉํ ๊ฒฐ๊ณผ X'1, X'2, ..., X'N๋ฅผ ์ถ๋ ฅํด๋ณด์.


### **[์๋ ฅ]**
<br>

์ฒซ์งธ ์ค์ N์ด ์ฃผ์ด์ง๋ค.

๋์งธ ์ค์๋ ๊ณต๋ฐฑ ํ ์นธ์ผ๋ก ๊ตฌ๋ถ๋ X1, X2, ..., XN์ด ์ฃผ์ด์ง๋ค.

### **[์ถ๋ ฅ]**
<br>

์ฒซ์งธ ์ค์ X'1, X'2, ..., X'N์ ๊ณต๋ฐฑ ํ ์นธ์ผ๋ก ๊ตฌ๋ถํด์ ์ถ๋ ฅํ๋ค.

___


### **[ํ์ด]**

- ์ ๋ ฌ์ ์ด์ฉํ ๋ฌธ์ ์์ต๋๋ค.
- ๊ธฐ์กด ๋ฐฐ์ด์ ์ ๋ ฌ ์ํฌ ๊ฒฝ์ฐ, ์ดํ ๊ธฐ์กด ๋ฐฐ์ด์ ๊ฐ ๊ฐ์ ์์น๋ฅผ ์ ์ ์์ผ๋ฏ๋ก clone() ๋ฉ์๋๋ฅผ ํตํด ๊น์ ๋ณต์ฌ๋ฅผ ํฉ๋๋ค.
- Map์ key๋ ์ขํ๊ฐ์, value๋ ์ขํ๊ฐ์ ๋ํ ์ต์ ์ธ๋ฑ์ค๋ฅผ ์ ์ฅํฉ๋๋ค.
- ๋ง์ฝ, Map์ ์ด๋ฏธ ์๋ ๊ฐ์ด๋ผ๋ฉด ๋ฌด์ํ๊ณ , ์๋ ๊ฐ์ด๋ผ๋ฉด ์ขํ๊ฐ๊ณผ ์ธ๋ฑ์ค๋ฅผ ์ ์ฅํ๋ฉฐ ํ๋ ์ฆ๊ฐ์ํต๋๋ค.
- ๊ฐ์ ๊ฐ์ ธ์ฌ ๋๋ ๊ธฐ์กด ๋ฐฐ์ด์ ์ขํ๊ฐ์ ์๋ ฅํด value๋ฅผ ๊ฐ์ ธ์ค๋ฉด ๋ฉ๋๋ค.
