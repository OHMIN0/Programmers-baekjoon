class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        String ret = "";
        
        // 조심해야할게 code는 문자열임.
        // code.charAt(i)로 나오는 결과값은 char타입임을 주의해야함. 
        // 따라서. code.charAt(i) == 1이 아닌, code.charAt(i) == '1'로 해야지 정상적으로 실행됨.
        for (int i = 0; i<code.length(); i++) {
            if (mode == 0) {
                if (code.charAt(i) != '1' && i%2==0)    
                    ret += code.charAt(i);
                else if (code.charAt(i) == '1') 
                    mode = 1;
            }
            else if (mode == 1) {
                if (code.charAt(i) != '1' && i%2==1)
                    ret += code.charAt(i);
                else if (code.charAt(i) == '1') 
                    mode = 0;
            }
        }
        if (ret == "") 
            ret = "EMPTY";
        
        answer = ret;
        
        return answer;
    }
}