class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //String nStr = Integer.toBinaryString(n);
        // n=10이면, nStr은 "1010".
        
        int bitCount = Integer.bitCount(n);
        
        int next = n+1;
        while(true) {
            if (Integer.bitCount(next) == bitCount) {
                answer = next;
                break;
            }
            next++;
        }
        
        
        return answer;
    }
}