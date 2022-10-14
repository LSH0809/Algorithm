package baekjoon.Baekjoon_9935;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        String bomb = reader.readLine();
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));

            if (stack.size() >= bomb.length()) {
                boolean flag = true;
                for (int j = 0; j < bomb.length(); j++) {
                    if (stack.get(stack.size() - bomb.length() + j) != bomb.charAt(j)) {
                        flag = false;
                        break;
                    }
                }

                if (flag == true) {
                    for (int k = 0; k < bomb.length(); k++) {
                        stack.pop();
                    }
                }
            }
        }

        for (Character c : stack) {
            sb.append(c);
        }

        if (sb.length() == 0) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb.toString());
        }
    }
}

//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String input = reader.readLine();
//        String bomb = reader.readLine();
//        String answer = "";
//
//        while(true){
//            if(input.length() == 0){
//                answer = "FRULA";
//                break;
//            }
//            if(input.contains(bomb)){
//                input = input.replace(bomb,"");
//            }else{
//                answer = input;
//                break;
//            }
//        }
//        System.out.println(answer);
//    }

