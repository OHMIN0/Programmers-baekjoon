class Solution {
    public int[] solution(int n) {
        int[] ans = {};
        
        if (n%2 == 0)
            ans = new int[n/2];
        else
            ans = new int[n/2+1];
        
        int idx = 0;
        for (int i = 1; i<n+1; ) {
            ans[idx++] = i;
            i = i+2;
        }
        
        return ans;
    }
}