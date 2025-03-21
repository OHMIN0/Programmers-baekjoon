import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = -1;
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i<s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            }
            else { // 스택에 한개라도 요소가 들어있을 때
                if (s.charAt(i) == stack.peek()) { // 현재 s[i]와 스택 젤 상단의 요소가 같다면
                    stack.pop(); // 해당 요소를 제거
                }
                else { // 현재 s[i]와 최상단 요소의 값이 다르다면
                    stack.push(s.charAt(i));
                }
            }
        }
        
        if (stack.isEmpty()) { // 반복문으로 문자열s를 다 스택에 옮기고 난 뒤에 스택이 비어있다면
            answer = 1;
        }
        else { // 아직 요소가 하나라도 남아있다면
            answer = 0;
        }
        
        
        return answer;
    }
}