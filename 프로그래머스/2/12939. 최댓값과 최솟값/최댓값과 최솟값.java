import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 공백을 기준으로 split해서 나온 숫자들을 splitNumber문자열 배열에 옮김
        String[] splitNumber = s.split("\\s+");
        
        // splitNumber의 행 사이즈만큼의 정수형num배열을 만들고,
        // for문으로 splitNumber배열의 i행마다 위치한 문자열형태의 정수들을 
        // int형으로 변환하여 num[i]에 넣어줌
        int num[] = new int[splitNumber.length];
        for (int i = 0; i<splitNumber.length; i++) {
            num[i] = Integer.parseInt(splitNumber[i]);
        }
        // 이제 num[]배열에 순수하게 추출된 정수들만 남아있음
        
        
        // num배열을 순회하면서 min값,max값 선별
        int min = num[0]; 
        int max = num[0];
        for (int i = 0;i<num.length; i++) {
            if (num[i] < min)
                min = num[i];
            if (num[i] > max)
                max = num[i];
        }
        
        String min_str = String.valueOf(min);
        String max_str = String.valueOf(max);
        
        answer = min_str + " " + max_str;
        
        
        return answer;
    }
}