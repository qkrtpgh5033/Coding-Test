import java.util.*;

class Level_1_13 {
    public int[] solution(int[] arr, int divisor) {

        // 나누어 떨어지는 숫자 배열

        ArrayList <Integer> list = new ArrayList<>();


        boolean flag = false;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % divisor == 0)
            {
                list.add(arr[i]);
            }
        }


        if(list.size() == 0)
        {
            int [] result = {-1};
            return result;
        }

        Collections.sort(list); // 오름차순

        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++)
        {
            answer[i] = list.get(i);
        }


        return answer;
    }
}
