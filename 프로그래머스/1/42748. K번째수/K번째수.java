import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        int answerSize = commands.length;   // 리턴할 answer배열의 길이가 될 변수
        int[] answer = new int[answerSize]; 
        
        // 아래 반복문에서 answer에 정수 하나씩을 넘기기 전 사용할 임시로 쓸 배열
        int[] tmp = new int[array.length];  
        
        // commands[i]의 값들을 이용해서 배열을 추출하고, 각 배열을 sort하는 반복문
        for (int a = 0; a < commands.length; a++) {
            
            int i = commands[a][0]-1;
            int j = commands[a][1]-1;
            int k = commands[a][2]-1;
            
            // array배열의 (i)~(j)인덱스까지를 추출해서 tmp배열에 저장
            // array,i,j로 입력값을 주면, array배열에서 i~(j-1)까지를 추출하여 저장되므로, +1해줬음
            tmp = Arrays.copyOfRange(array, i, j+1); 
            
            // tmp배열 오름차순 정렬
            Arrays.sort(tmp);
            
            // tmp[]에서 k와 일치하는 인덱스를 추출하여 answer[i]에 저장
            answer[a] = tmp[k];
        }
        
        
        
        return answer;
    }
}