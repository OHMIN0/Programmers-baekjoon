import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(0);
        fib.add(1);
        
        for (int i = 0; i<100000; i++) {
            fib.add( (fib.get(i)+fib.get(i+1))%1234567 );
        }
        
        answer = fib.get(n);
        
        return answer;
    }
}