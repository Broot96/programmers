import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
       Stack<Integer> stack = new Stack<>();

        for(Integer i : arr){

            if(!(stack.isEmpty())){
                if(!(Objects.equals(stack.peek(), i))){
                    stack.push(i);
                }
            }else {
                stack.push(i);
            }
        }
        List<Integer> answer = new ArrayList<>(stack);
        return answer;
    }
}