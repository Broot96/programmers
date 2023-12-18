import java.util.*;
class Solution {
    static int startX;
    static int startY;
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
     
        // 동서남북 이동할 좌표 map에 삽입
        Map<String, int[]> map = new HashMap<>();
        map.put("N", new int[]{-1, 0});
        map.put("E", new int[]{0, 1});
        map.put("S", new int[]{1, 0});
        map.put("W", new int[]{0, -1});
        
        startX = 0;
        startY = 0;
        
        // park 2차원 배열로 만들며 시작 위치 탐색
        String[][] arr = new String[park.length][park[0].length()];
        for(int i=0; i < park.length; i++) {
            String[] temp = park[i].split("");
            for(int j=0; j < temp.length; j++) {
                arr[i][j] = temp[j];
                if(temp[j].equals("S")) {
                    startX = i;
                    startY = j;
                }
            }       
        }
        
        // routes를 순회하며 move 메서드 호출
        for(int i = 0; i < routes.length; i++) {
            String[] temp = routes[i].split(" ");
            int[] movePoint = map.get(temp[0]);
            move(arr, startX, startY, movePoint, Integer.parseInt(temp[1]));
        }
        
        answer[0] = startX;
        answer[1] = startY;
        return answer;
    }
    // 재귀를 이용한 탐색 메서드
    public void move(String[][] arr, int x, int y, int[] movePoint, int cnt) {
    	// 경로가 모두 이동 가능한 길이었다면 startX, startY에 이동 좌표 추가
        if(cnt == 0) {
            startX = x;
            startY = y;
            return;
        }
        // 한칸씩 이동하며 경로 탐색
        int nextX = x + movePoint[0];
        int nextY = y + movePoint[1];
        // 2차원 배열을 벗어나지 않으면서 X가 아니면 재귀 호출
        if(nextX >= 0 && nextX < arr.length && nextY >= 0 && nextY < arr[0].length) {
            if(!arr[nextX][nextY].equals("X")) {
                    move(arr, nextX, nextY, movePoint, cnt - 1);
            }
        }
    }
}