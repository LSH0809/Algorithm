package programmers.level2.소수찾기;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
    static Set<Integer> set = new HashSet<>();
    static boolean[] visited;
    
    public int solution(String numbers) {
        String str = "";
        int count = 0;
        visited = new boolean[10];
        for(int i = 0; i< numbers.length(); i++){
            createNumber(numbers,str,i+1);
        }
        
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()){
            int value = iter.next();
            System.out.println(value);
            if(isPrime(value)){
                count += 1;
            }
        }
        return count;
    }
    
    private boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for(int i = 2; i * i < number + 1; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    
    private void createNumber(String numbers, String str, int limit){
        if(str.length() == limit){
            Integer number = Integer.parseInt(str);
            set.add(number);
            return;
        }
        
        for(int i = 0; i< numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                str += numbers.charAt(i);
                createNumber(numbers,str,limit);
                visited[i] = false;
                str = str.substring(0,str.length()-1);
            }
        }
    }
}
