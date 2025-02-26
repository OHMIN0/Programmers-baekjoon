class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        
        String atbt_string = Integer.toString(a) + Integer.toString(b); 
        // "291"
        int atbt = Integer.parseInt(atbt_string); 
        // 291
        
        int at2bt = 2 * a * b; 
        // 364
        
        if (atbt >= at2bt)
            answer = atbt;
        else
            answer = at2bt;
        
        
        return answer;
    }
}