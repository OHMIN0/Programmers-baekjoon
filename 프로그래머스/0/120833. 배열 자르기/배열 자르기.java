class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        int size = num2-num1+1;
        int[] answer = new int[size];
        
        int idx = 0;
        for (int i = num1; i<=num2; i++) {
            answer[idx++] = numbers[i];
        }
        
        return answer;
    }
}