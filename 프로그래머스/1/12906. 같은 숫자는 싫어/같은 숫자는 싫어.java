import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // push한 순서대로 다시 리턴해줘야되므로, 스택말고 큐를 사용함
        Queue<Integer> q = new LinkedList<>();
        
        // 일단 입력으로 주어진 배열의 첫번째 인덱스를 큐에 push
        q.add(arr[0]);
        // now는 가장 마지막에 큐에 삽입한 원소를 확인하기위해 필요한 변수.
        int last_add = arr[0]; 
        
        // 배열의 모든 원소 조회하며, 현재의 큐의 최상단 요소와 다른 값을 가진 경우에만 스택에 add
        for (int i = 1; i<arr.length; i++) {
            if (last_add != arr[i]) {
                q.add(arr[i]);
                last_add = arr[i];
            }
        }
        
        // 답으로 리턴할 answer배열 선언
        int answer[] = new int[q.size()];
        
        // for문으로 스택 내 모든 요소들을 answer배열에 순서대로 추가
        int size = q.size();
        for (int i = 0; i<size; i++) {
            answer[i] = q.remove();
        }
        
        return answer;
    }
}