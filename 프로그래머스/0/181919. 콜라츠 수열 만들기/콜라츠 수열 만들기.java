import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();

        while(n!=1) {
            arr.add(n);
            if (n%2 == 0) { // n이 짝수일 경우
                n = n/2;
            } else {        // n이 홀수일 경우
                n = (3*n)+1;
            }
        }
        arr.add(n);
        answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}