// "어떤 자연수 n을 연속된 자연수의 합으로 표현하는 
//                 방법의 수는 n의 홀수 약수의 개수와 같다."

class Solution {
    public int solution(int n) {
        int cnt = 0;
        
        for (int i=1; i<=n; i++) {
            if (n%i == 0 && i%2==1) {
                cnt++;
            }
        }
        
        return cnt;
    }
}