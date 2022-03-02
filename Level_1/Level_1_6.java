import java.util.*;
import java.util.ArrayList;

public class Level_1_6 {
    public int[] solution(int []arr) {
        // 같은 숫자는 싫어

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length-1; i++)
        {

            if ( arr[i] != arr[i+1])
                list.add(arr[i]);
        }

        list.add(arr[arr.length-1]);

        int [] answer = new int[list.size()];
        for(int i = 0 ; i < answer.length; i++)
        {
            answer[i] = list.get(i);
        }


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}