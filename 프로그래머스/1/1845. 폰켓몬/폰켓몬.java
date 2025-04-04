import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        // p에는 nums[]에 들어있는 포켓몬 종류 번호가 하나씩 대입됨.
        for (int p : nums) {
            map.put(p, map.getOrDefault(p,0)+1);
        }
        
        if (nums.length/2 > map.size()) {   // 가져갈 수 있는 포켓몬 수보다 갖고있는 포켓몬 종류 수가 적으면
            answer = map.size();            // 갖고있는 포켓몬 종류 수를 리턴 
        } else {                            // 아니라면
            answer = nums.length/2;         // 가져갈 수 있는 제한(n마리 중 n/2마리)만큼을 리턴
        }
        
        return answer;
    }
}