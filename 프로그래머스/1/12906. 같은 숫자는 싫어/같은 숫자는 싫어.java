import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
       Stack<Integer> stack = new Stack<>();

        for(Integer i : arr){
           if((stack.size() == 0) || !Objects.equals(stack.peek(), i)){
                    stack.push(i);
            }
        }
        List<Integer> answer = new ArrayList<>(stack);
        return answer;
    }
}