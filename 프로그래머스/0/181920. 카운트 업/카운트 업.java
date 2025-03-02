import java.util.ArrayList;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = start_num; i<=end_num; i++) {
            arr.add(i);
        }
        
        answer = arr.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}