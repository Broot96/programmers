import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        
        Arrays.sort(targets, (o1, o2) -> {
            if(o1[1] == o2[1]){
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
        
        int end = targets[0][1];
        answer++; // 첫 번째로 만들어지는 요격 시스템
        
        for(int[] tar : targets){
            if(tar[0] >= end){
                end = tar[1];
                answer++; // 시점이 요격 시스템의 상한보다 오른쪽에 있기 때문에 새로운 요격 시스템 추가
            }
        }
        
        return answer;
    }
}

