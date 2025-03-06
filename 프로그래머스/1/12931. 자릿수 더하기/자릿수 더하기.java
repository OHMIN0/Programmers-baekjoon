import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
    
        String s = String.valueOf(n);

        int size = s.length();
        
        for (int i = 0; i<size; i++) {
            // s.charAt(i)는 s문자열의 i번째문자를 char형으로 바꿔주는 메소드.
            // 그런데 만약 String에 사용가능한 Integer.valueOf(s)를 쓰게되면 
            // s의 i번째 인덱스 문자는 char형->string->int로 바뀌는게 아니라, char형->int형으로 바뀌게 되어
            // ASCII대로 49 50 51같은 큰 숫자로 바뀌게됨.
            // 따라서 이런식으로 처리하게 되었음
            answer += s.charAt(i)-'0'; 
        }
            
        return answer;
    }
}