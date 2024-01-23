import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    boolean answer = false;
    public boolean solution(String s) {
        if(s.length() == 4 ||s.length() == 6){
            Pattern pt = Pattern.compile("^[0-9]*$");
            Matcher match = pt.matcher(s);

            return match.find();
        }
        return answer;
    }
}