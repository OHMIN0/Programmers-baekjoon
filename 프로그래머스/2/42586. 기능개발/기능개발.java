import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        // progresses의 각 인덱스가 100%를 채우는데 필요한 일수를 계산하고, 보관할 큐 take_days
        // 스택으로 하면 입력받은 내용(작업) 순이 아닌, 그 역순으로 출력해야되므로 큐를 사용함
        Queue<Integer> q = new LinkedList<>();
        
        // 한번에 배포가능한 작업들을 count한 담에 보관.
        // 이 리스트의 크기로 answer배열을 선언할 예정
        ArrayList<Integer> cnt_list = new ArrayList<>();
        
        for (int i = 0; i<progresses.length; i++) {
            int day = 0; // 작업별 진척도를 100% 채울때까지의 최소 일수
            while(progresses[i] < 100) { // 작업[i]가 100% 이하인동안 반복수행
                progresses[i] += speeds[i];
                day++;
            }
            q.add(day);
        }
        // 입출력1의 경우, days = [7,3,9]
        // 입출력2의 경우, days = [5,10,1,1,20,1]
        

        int last = q.remove();      // days큐에 맨 먼저 들어온 요소를 삭제 후 last에 리턴
                                    // last변수는 마지막에 answer배열에 값을 추가하기위해 비교할때 계속 필요
        int cnt = 1;                // 한번에 배포가능한 작업량 count할 변수
        
        while (!q.isEmpty()) { 
            if (last < q.peek()) {
                cnt_list.add(cnt);
                cnt = 1;
                last = q.remove();
            } 
            else { // last >= q.peek()
                cnt++;
                q.remove();
            }
        }
        cnt_list.add(cnt);
        
        
        int[] answer = new int[cnt_list.size()];
        // 리스트에 있던 값을 answer로 옮겨줌
        for (int i = 0; i<answer.length; i++) {
            answer[i] = cnt_list.get(i);
        }
        
        return answer;
    }
}