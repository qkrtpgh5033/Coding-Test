import java.util.*;

class Level_1_15 {
    public int[] solution(int[] numbers) {


        // 두개 뽑아서 더하기

        HashSet<Integer> set = new HashSet<>();

        // 모든 수 저장
        for(int i = 0; i < numbers.length-1; i++)
        {
            for(int j = i+1; j < numbers.length; j++)
            {
                int result = numbers[i] + numbers[j];
                set.add(result);
            }
        }


//         Iterator iter = set.iterator();

//         while(iter.hasNest())
//         {
//             list.add(iter.next());
//         }

        ArrayList <Integer> list = new ArrayList<>(set);
        //정렬
        Collections.sort(list);



        // 리턴
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
        {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

