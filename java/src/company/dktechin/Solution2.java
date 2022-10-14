package company.dktechin;

import java.io.*;
import java.util.*;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(),"]");
        Set<Integer> set = new HashSet<>();
        StringBuffer sb = new StringBuffer();

        while(st.hasMoreTokens()){
            String str = st.nextToken();
            StringTokenizer rst = new StringTokenizer(str,",[ ");
            while(rst.hasMoreTokens()) {
                set.add(Integer.parseInt(rst.nextToken()));
            }
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        for(int i = 0; i< list.size(); i++){
            sb.append(list.get(i));
            if(i != list.size() - 1){
                sb.append(", ");
            }
        }

        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}
