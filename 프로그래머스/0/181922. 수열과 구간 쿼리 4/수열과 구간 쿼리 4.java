class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        int s,e,k;
        for (int i = 0; i<queries.length; i++) {
            s = queries[i][0];
            e = queries[i][1];
            k = queries[i][2];
            
            int j;
            for (j = s; j<=e; j++) {
                if (j % k == 0) 
                    arr[j]++;
            }
        }
        
        answer = arr;
        return answer;
    }
}