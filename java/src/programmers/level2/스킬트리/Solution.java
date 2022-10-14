package programmers.level2.스킬트리;

public class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        String[] skill_split_arr = skill.split("");
        // C B D

        String temp_str = "";
        String result = "";
        String temp1 = "";
       for(String skill_tree : skill_trees){
           String skill_tree_plus = skill_tree;
           for(int i =0 ; i<skill_split_arr.length; i++){
               skill_tree = skill_tree.replace(skill_split_arr[i],"");
           }
           temp_str = skill_tree;
//           System.out.println(temp_str);
           //AE AF AE A

           String[] temp_str_arr = temp_str.split("");
            //A와 E
//           System.out.println(temp_str_arr[0]);
//           A

//           System.out.println(skill_tree_plus);
//           BACDE
           for(int i = 0; i< temp_str_arr.length; i++){
               skill_tree_plus = skill_tree_plus.replaceAll(temp_str_arr[i],"");
           }

           System.out.println(skill_tree_plus);

           if(result.equals(skill)){
               answer++;
           }
       }
        return answer;
    }
}
