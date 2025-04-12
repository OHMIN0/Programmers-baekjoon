import java.util.*;

class Solution {
    public int[] solution(long n) {
        
        // n을 문자열로 변환
        String s = String.valueOf(n);
        
        // 한글자씩 int형으로 변환 후, answer에 삽입
        int[] answer = new int[s.length()];
        for (int i = 0; i<s.length(); i++) {
            answer[i] = s.charAt(s.length()-1-i)-'0';
        }
        
        
        return answer;
    }
}