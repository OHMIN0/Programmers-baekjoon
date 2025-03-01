class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        int s,e,k;
        int size = queries.length; // 입력된 매개변수 queries의 길이
        int[] tmp_ans = new int[size];
        
        for (int rep = 0; rep<queries.length; rep++) {
            s = queries[rep][0];
            e = queries[rep][1];
            k = queries[rep][2];
            int min = 1000001; // 1,000,001
            
            for (int i = s; i<=e; i++) {
                if (arr[i]>k && min>arr[i])
                    min = arr[i];
            }
            if (min == 1000001)
                tmp_ans[rep] = -1;
            else
                tmp_ans[rep] = min;
        }
        answer = tmp_ans;
        return answer;
    }
}