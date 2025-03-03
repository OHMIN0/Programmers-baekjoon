import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        ArrayList<Integer> stk2
            = new ArrayList<>();

        int i = 0;
        while (i<arr.length) {
            if (stk2.isEmpty()) {
                stk2.add(arr[i]);
                i++;
            }
            else if ( !(stk2.isEmpty()) && stk2.get(stk2.size()-1) < arr[i]) {
                stk2.add(arr[i]);
                i++;
            }
            else if ( !(stk2.isEmpty()) && stk2.get(stk2.size()-1) >= arr[i]) {
                stk2.remove(stk2.size()-1);
            }
        }
        stk = stk2.stream().mapToInt(Integer::intValue).toArray();

        
        return stk;
    }
}