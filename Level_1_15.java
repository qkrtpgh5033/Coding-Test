import java.util.*;

class Level_1_15 {
    public int[] solution(int[] numbers) {

        ArrayList <Integer> resulte_list = new ArrayList<>();

        // 모든 수 저장
        for(int i = 0; i < numbers.length-1; i++)
        {
            for(int j = i+1; j < numbers.length; j++)
            {

                int result = numbers[i] + numbers[j];
                resulte_list.add(result);

            }
        }

        //정렬
        Collections.sort(resulte_list);

        //중복제거
        for(int i = 0; i < resulte_list.size()-1; i++)
        {
            if(resulte_list.get(i) - resulte_list.get(i+1) == 0)
            {
                resulte_list.remove(i);
                i--;
            }
        }

        // 리턴
        int[] answer = new int[resulte_list.size()];
        for(int i = 0; i < resulte_list.size(); i++)
        {
            answer[i] = resulte_list.get(i);
        }

        return answer;
    }
}

