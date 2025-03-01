class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        int i, j;
        for (int r = 0; r<queries.length; r++) {
            i = queries[r][0];
            j = queries[r][1];
            
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        answer = arr;
        return answer;
    }
}