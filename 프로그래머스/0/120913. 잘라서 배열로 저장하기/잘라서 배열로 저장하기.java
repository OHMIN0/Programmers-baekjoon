import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length()+n-1)/n];
        
        int rep = 0;
        
        for (int start = 0; start < my_str.length(); start += n) {
            int end = Math.min(start + n, my_str.length());
            answer[rep++] = my_str.substring(start, end);
        }
        
        return answer;
    }
}