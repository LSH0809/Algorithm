package company.bucketPlace;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution3 {
    public static void main(String[] args) {
        String tString1 = "this is {template} {template} is {state}";
        String tString2 = "this is {template} {template} is {state}";
        String tString3 = "this is {template} {template} is {state}";
        String tString4 = "this is {template} {template} is {state}";
        String tString5 = "{a} {b} {c} {d} {i}";

        String[][] variables1 = {{"template", "string"}, {"state", "changed"}};
        String[][] variables2 = {{"template", "string"}, {"state", "{template}"}};
        String[][] variables3 = {{"template", "{state}"}, {"state", "{template}"}};
        String[][] variables4 = {{"template", "{state}"}, {"state", "{templates}"}};
        String[][] variables5 = {{"b", "{c}"}, {"a", "{b}"}, {"e", "{f}"}, {"h", "i"}, {"d", "{e}"}, {"f", "{d}"}, {"c", "d"}};

        System.out.println(solution(tString1,variables1));
        System.out.println(solution(tString2,variables2));
        System.out.println(solution(tString3,variables3));
        System.out.println(solution(tString4,variables4));
        System.out.println(solution(tString5,variables5));
    }

    public static String solution(String tstring, String[][] variables) {
        Map<String, String> map = new HashMap<>();
        for (String[] variable : variables) {
            map.put(variable[0], variable[1]);
        }

        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(tstring, " ");
        while (st.hasMoreTokens()) {
            StringBuffer sbr = new StringBuffer(st.nextToken());

            if(sbr.charAt(0) == '{'){
                sbr.deleteCharAt(sbr.length() - 1);
                sbr.deleteCharAt(0);
            }

            if (map.containsKey(sbr.toString())) {
                sb.append(map.get(sbr.toString()));
            }
            else{sb.append(sbr.toString());}

            sb.append(" ");

        }

        return sb.toString();
    }
}
