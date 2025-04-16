class Solution {
    
    public boolean or(boolean x, boolean y) {
        if (x == false && y == false) 
            return false;
        else
            return true;
    }
    
    public boolean and(boolean x, boolean y) {
        if (x == true && y == true) 
            return true;
        else
            return false;
    }
    
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = and(or(x1,x2), or(x3,x4));
        
        
        return answer;
    }
}