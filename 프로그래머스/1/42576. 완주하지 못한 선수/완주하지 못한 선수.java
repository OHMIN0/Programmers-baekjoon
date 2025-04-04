import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String p : participant) {
            map.put(p, map.getOrDefault(p,0) + 1);
        }
        
        for (String p : completion) {
            map.put(p, map.get(p)-1);
        }
        
        for (String p : map.keySet()) {
            if (map.get(p) != 0) {
                answer = p;
            }
        }
        
        
        return answer;
    }
}