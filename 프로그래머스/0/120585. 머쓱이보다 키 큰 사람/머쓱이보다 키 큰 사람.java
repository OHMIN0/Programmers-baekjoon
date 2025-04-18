import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        int size = array.length;
        
        Arrays.sort(array);
        for (int i = 0; i<size; i++) {
            if (array[i] > height) {
                answer = size-i;
                break;
            }
        }
        
        return answer;
    }
}