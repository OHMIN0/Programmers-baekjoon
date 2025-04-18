class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int size = numbers.length;
        
        for (int i = 0; i<size; i++) {
            answer += (double)numbers[i];
        }
        
        return answer/size;
    }
}