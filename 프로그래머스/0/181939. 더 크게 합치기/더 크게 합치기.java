class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String atbt_string = Integer.toString(a) + Integer.toString(b); 
        // "991"
        String btat_string = Integer.toString(b) + Integer.toString(a); 
        // "919"
        
        int atbt = Integer.parseInt(atbt_string); // 991
        int btat = Integer.parseInt(btat_string); // 919
        
        if (atbt >= btat)
            answer = atbt;
        else
            answer = btat;
        
        return answer;
    }
}