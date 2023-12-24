import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int num : nums){
            hm.put(num, 0);
        }

        if(hm.size() < nums.length/2){
            answer = hm.size();
        }else {
            answer = nums.length/2;
        }
        
        return answer;
    }
}