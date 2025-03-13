class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int a = numer1*denom2 + numer2*denom1;
        int b = denom1*denom2;
        
        // 유클리드 알고리즘!
        int gcd = gcd(a, b);
        a /= gcd;
        b /= gcd;
        
        
        answer[0] = a;
        answer[1] = b;
        
        return answer;
    }
}