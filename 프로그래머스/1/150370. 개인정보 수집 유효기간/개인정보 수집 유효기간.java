import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate baseDate = LocalDate.parse(today, formatter);
        LocalDate thisDate;

        for(String term : terms){
            String[] termInfo = term.split(" ");
            hm.put(termInfo[0], Integer.valueOf(termInfo[1]));
        }

        for(int i = 0; i < privacies.length; i++){
            String[] privacyInfo = privacies[i].split(" ");
            String privacyDate = privacyInfo[0];
            String privacyType = privacyInfo[1];
            
            int dd = Integer.valueOf(privacyDate.split("\\.")[2]);
           
            thisDate = LocalDate.parse(privacyDate, formatter);
           

            if(!(dd == 1)){
                thisDate = thisDate.plusMonths(hm.get(privacyType)).minusDays(1);
            }else {
                thisDate = thisDate.plusMonths(hm.get(privacyType)-1).withDayOfMonth(28);
            }
            
            if(baseDate.isAfter(thisDate)){
                answer.add(i+1);
            }
        }
        return answer;
    }
}