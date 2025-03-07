import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        // 최솟값을 얻으려면 우선 배열 내 숫자들을 다 정렬시키고, 
        // A[]의 i인덱스값과 B[]의 size-i-1인덱스값을 곱한 값을 다 더하는 식으로 가야함
        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int i = 0; i<A.length; i++) {
            answer += A[i]*B[B.length-i-1];
        }
        
        return answer;
    }
}