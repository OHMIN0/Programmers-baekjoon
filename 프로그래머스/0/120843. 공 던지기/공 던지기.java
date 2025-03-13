class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int max = numbers.length;
        int now = 1;
        
        for (int i = 1; i<k; i++) {
            now += 2;
            // 디버깅
            System.out.println(i + " " + now + " ");
            if (now > max)
                now = now-max;
        }
        answer = now;
        return answer;
    }
}