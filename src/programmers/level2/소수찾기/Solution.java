package programmers.level2.소수찾기;

import java.util.ArrayList;

public class Solution {
    ArrayList<Integer> arrayList = new ArrayList<>();

    public int solution(String numbers) {
        int answer = 0;
        String temp = "";

        for(int i = 0; i< numbers.length(); i++){
            get_numbers(numbers,temp,i);
        }

        for(int i = 0; i< arrayList.size(); i++){
            answer = check(arrayList.get(i));
        }
        return answer;
    }

    public void get_numbers(String numbers,String temp, int len){

    }

    public int check(int number){
        int answer = 0;
        boolean flag = true;
        if(number == 0 || number == 1){
            flag = false;
        }
        for(int i = 2; i <= (int)Math.sqrt(number); i+= i){
            if(number % i == 0){
                flag = false;
            }
        }
        if(flag == true){
            answer++;
        }
        return answer;
    }
}
