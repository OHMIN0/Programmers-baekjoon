import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = l; i<=r; i++) {
            String str_i = Integer.toString(i);
            int valid = 1; // 1이면 0과 5로만 구성;; 0이면 break;
            // str_i가 0과 5로만 구성됐는지 확인하는 반복문.
            for (int str_idx=0; str_idx<str_i.length(); str_idx++) {
                // 0이나 5가 하나라도 발견되면 valid를 0으로 바꾸고 break
                if (str_i.charAt(str_idx)!='5' && str_i.charAt(str_idx)!='0') {
                    valid = 0;
                    break;
                }
            }
            // str_i가 0과 5로만 구성되어있다면 i를 arr에 추가.
            if (valid == 1) 
                arr.add(i);
        }
        // Arraylist<Integer> arr을 정수형배열로 변환.
        // 만약 arr이 비어있다면, -1을 원소로 추가한뒤 변환.
        if (arr.isEmpty()) 
            arr.add(-1);
        answer = arr.stream().mapToInt(Integer::intValue).toArray();
      
        return answer;
    }
}
