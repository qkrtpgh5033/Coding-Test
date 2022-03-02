import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Level_1_7 {
    public long solution(long n) {
        //정수 내림차순으로 배치하기

        String str = Long.toString(n);
        Integer [] arr = new Integer[str.length()];

        for(int i = 0 ; i < str.length(); i++)
            arr[i] =  str.charAt(i) - '0'; // String to Int


        Arrays.sort(arr,Collections.reverseOrder());


        str = "";
        for(int i = 0 ; i < arr.length; i++)
            str += arr[i];

        long answer = Long.parseLong(str); // String to Long
        return answer;
    }
}
