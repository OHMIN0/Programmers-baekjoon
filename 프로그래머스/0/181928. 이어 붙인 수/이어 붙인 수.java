class Solution {
    public int solution(int[] num_list) {
        int[] list = num_list;
        int answer = 0;
        String sum_0 = "";
        String sum_1 = "";
        
        for (int i = 0; i<list.length; i++) {
            if (list[i] % 2 == 1) sum_1 += Integer.toString(list[i]);
            else sum_0 += Integer.toString(list[i]);
        }
        
        answer = Integer.valueOf(sum_0) + Integer.valueOf(sum_1);
        
        return answer;
    }
}