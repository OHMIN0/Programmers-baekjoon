class Solution {
    
    public int isThereThree(int n) {
        String n_str = String.valueOf(n);
        if (n_str.contains("3")) {
            return 1;
        }
        else
            return 0;
    }
    
    public int solution(int n) {
        int answer = 0;
        
        int cnt = 0;
        for (int i = 1; i<=n+cnt; i++) {
            if (i%3==0 || isThereThree(i)==1) {
                cnt++;
                System.out.print(i + " ");
            }
        }
        
        answer = n+cnt;
        return answer;
    }
}