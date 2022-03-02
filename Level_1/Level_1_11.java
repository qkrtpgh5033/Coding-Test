import java.util.Arrays;
import java.util.Collections;

class Level_1_11 {
    public String solution(String s) {

        // 문자열 내림차순으로 배치하기

        String [] str = s.split("");

        Arrays.sort(str, Collections.reverseOrder());

        String answer = "";

        for(int i = 0 ; i < str.length; i++)
            answer += str[i];

        return answer;
    }
}
