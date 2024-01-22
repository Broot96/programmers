import java.util.*;

class Solution {
  public String solution(String[] seoul) {
            String answer = "";
      
            //x에 김서방의 위치를 저장하세요.
            int x = Arrays.asList(seoul).indexOf("Kim");        
            
            answer = "김서방은 "+x+"에 "+"있다" ;

          return answer;
      }
}
