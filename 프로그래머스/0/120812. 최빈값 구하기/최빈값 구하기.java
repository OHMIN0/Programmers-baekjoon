import java.util.*;

class Solution {
    public int solution(int[] array) {
        
        int[] counts = new int[1000];
        
        for (int num : array) {
            counts[num]++;
        }
        
        int maxFrequency = 0; // 가장 높은 빈도수를 저장할 변수
        for (int count : counts) {
            // counts 배열을 순회하며 최대 빈도수를 갱신
            if (count > maxFrequency) {
                maxFrequency = count;
            }
        }

        int mode = -1;         // 최빈값 후보를 저장할 변수, 초기값 -1
        boolean foundMultiple = false; // 최빈값이 여러 개인지 여부를 나타내는 플래그
        
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == maxFrequency) {
                if (mode != -1) {
                    foundMultiple = true;
                    break;
                }
                mode = i;
            }
        }

        if (foundMultiple)     // 최빈값이 여러 개였으면 -1 반환
            return -1;
        else                 // 최빈값이 유일하면 해당 값(mode) 반환
            return mode;
             
        
    }
}