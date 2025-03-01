class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        int size = num_list.length;
        // tmp는 num_list보다 크기가 1 더 큼.
        int tmp[] = new int[size+1];
        
        // tmp배열에 num_list배열을 하나씩 직접 복사
        for (int i = 0; i<size; i++) {
            tmp[i] = num_list[i];
        }
        
        int last = num_list[size-1];
        int pre = num_list[size-2];
        
        if (last > pre)
            tmp[size] = last-pre;
        else 
            tmp[size] = last*2;
        
        answer = tmp;
        return answer;
    }
}