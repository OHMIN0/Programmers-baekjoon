class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int pow = 1;
        
        for (int i = 0; i<num_list.length; i++) {
            pow *= num_list[i];
            sum += num_list[i];
        }
        
        if (pow < sum*sum) answer = 1;
        
        return answer;
    }
}