class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int cnt_sum = 0;
        int repeat_cnt = 0;
        while (true) {
            int cnt = 0;
            int i;
            for (i = 0; i<s.length(); i++) {
                if (s.charAt(i) == '0') {
                    s = s.substring(0,i) + s.substring(i+1);
                    cnt++;
                    i--;
                }
            }
            cnt_sum += cnt;
            repeat_cnt++;
            System.out.println(s);
            if (s.equals("1")) {
                break;
            }
            
            s = Integer.toBinaryString(s.length());
        }
        answer[0] = repeat_cnt;
        answer[1] = cnt_sum;
        return answer;
    }
}

/*
1. 문자열 처음 입력 들어옴
2. 순회하면서 0제거 
3. 문자열 형태의 수의 length를 이진수로 변환
4. 그 이진수형태를 다시 문자열로 변환
5. 1부터 반복
*/