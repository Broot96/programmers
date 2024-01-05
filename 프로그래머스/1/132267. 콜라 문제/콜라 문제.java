class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        int num = n;

        while(num >= a) {
            answer += num / a * b;
            num = num / a * b + num % a;
        }
        
        return answer;
    }
}