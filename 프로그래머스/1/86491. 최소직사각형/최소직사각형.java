import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int fnlMax = 0;
        int fnlMin = 0;
        
        for(int i = 0; i < sizes.length; i++){
            
            int[] size = sizes[i];
            
            // 넘어온 가로, 세로 길이를 최대값, 최소값 기준으로 재설정
            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);
            
            // 해당 명함의 최대길이와 여태 들어온 명함중 최대길이를 비교
            fnlMax = Math.max(fnlMax, max);
            fnlMin = Math.max(fnlMin, min);
        }
        
        answer = fnlMax * fnlMin;
        
        return answer;
    }
}