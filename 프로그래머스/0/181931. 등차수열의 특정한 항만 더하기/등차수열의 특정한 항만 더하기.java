class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int n = included.length; // 불린배열 included의 길이
        int value[] = new int[101];
        value[0] = a;
        int sum = 0;
        
        // 등차수열을 나타내는 value정수배열 값 초기화.
        for (int i = 1; i<101; i++) {
            value[i] = value[i-1] + d;
        }
        
        // true인 항의 값들을 더하는 반복문
        for (int i = 0; i<n; i++) {
            if (included[i] == true) 
                sum += value[i];
        }
        answer = sum;
        
        return answer;
    }
}