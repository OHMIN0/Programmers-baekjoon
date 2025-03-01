class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int size = numLog.length; // 12
        
        for (int i = 1; i<size; i++) { //i가 0~11인동안 시행
            if (numLog[i] - numLog[i-1] == 1)
                answer += 'w';
            else if (numLog[i] - numLog[i-1] == -1)
                answer += 's';
            else if (numLog[i] - numLog[i-1] == 10)
                answer += 'd';
            else if (numLog[i] - numLog[i-1] == -10)
                answer += 'a';
        }

        return answer;
    }
}