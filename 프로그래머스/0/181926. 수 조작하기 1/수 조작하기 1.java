class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        int size = control.length();
        
        for (int i = 0; i<size; i++) {
            if (control.charAt(i) == 'w')
                n = n+1;
            else if (control.charAt(i) == 's')
                n = n-1;
            else if (control.charAt(i) == 'd')
                n = n+10;
            else if (control.charAt(i) == 'a')
                n = n-10;
        }

        answer = n;
        return answer;
    }
}