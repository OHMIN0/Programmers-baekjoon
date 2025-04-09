import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int max_x = 0;
        int max_y = 0;
        int i_x = 0; 
        int i_y = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            // 명함은 어차피 직사각형
            // (상대적으로) 짧은 변들은 짧은 변들끼리, 긴 변들은 긴 변들끼리 비교하는 방식.
            i_x = Math.max(sizes[i][0], sizes[i][1]);
            i_y = Math.min(sizes[i][0], sizes[i][1]);
            
            // max_x는 긴 변들 중에서도 가장 긴 변의 길이가, 
            // max_y는 짧은 변들 중에서 가장 긴 변의 길이가 저장되게 됨.
            max_x = Math.max(i_x, max_x);
            max_y = Math.max(i_y, max_y);
        }
        
        answer = max_x * max_y;
        return answer;
    }
}