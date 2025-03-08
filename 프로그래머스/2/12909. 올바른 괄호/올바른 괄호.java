import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                if (stack.isEmpty()==true) {
                    return false;
                }   
                stack.pop();
            }
        }
        // s문자열을 순회하면서 push/pop을 마쳤는데
        // 여전히 스택에 괄호가 남아있으면 닫는 괄호가 부족했던것이므로, 
        // 비정상적인 결과이므로 false를 리턴해줘야함.
        if (stack.isEmpty() == false) {
            return false;
        }
        return answer;
    }
}