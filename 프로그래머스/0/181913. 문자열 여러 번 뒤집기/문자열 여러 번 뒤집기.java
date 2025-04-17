import java.util.*;

class Solution {
    
    public String reverse_str(String tg, int a, int b) {
        
        String tmp1 = tg.substring(0,a);
        String tmp2 = "";
        String tmp3 = tg.substring(b+1, tg.length());
        
        for (int i = b; i>=a; i--) {
            tmp2 += tg.charAt(i);
        }
        
        return tmp1+tmp2+tmp3;
    }
    
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        
        for (int i = 0; i<queries.length; i++) {
            answer = reverse_str(answer, queries[i][0], queries[i][1]);
        }

        return answer;
    }
}