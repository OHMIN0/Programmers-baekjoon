import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase();
        // 문자열0번째인덱스가 소문자a~z면 일단 대문자로 바꿈
        if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
            s = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        
        // 문자열 1번째부터 순회하면서, 이전 i-1인덱스가 공백이고 i인덱스가 a~z중 하나면 대문자로 변환
        for (int i = 1; i<s.length(); i++) {
            if (s.charAt(i) <= 'z' && s.charAt(i) >= 'a' && s.charAt(i-1) == ' ')
                s = s.substring(0, i) + Character.toUpperCase(s.charAt(i)) + s.substring(i+1);
        }
        
        answer = s;
        return answer;
    }
}