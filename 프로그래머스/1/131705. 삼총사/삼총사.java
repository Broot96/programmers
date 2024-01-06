import java.util.List;
import java.util.ArrayList;
class Solution {

    int count;

    public void func(int[] number, boolean[] visited, int start, int r){
        if(r==0){
            int temp = 0;
            for(int i=0;i<number.length;i++){
                if(visited[i]){
                    temp += number[i];
                }
            }
            if(temp == 0)count++;
        }

        for(int i=start;i<number.length;i++){
            visited[i] = true;
            func(number, visited, i+1, r-1);
            visited[i] = false;
        }
    }

    public int solution(int[] number) {
        int answer = 0;
        boolean[] visited = new boolean[number.length];
        count = 0;
        func(number, visited, 0, 3);
        answer = count;

        return answer;
    }
}