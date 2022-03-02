import java.util.*;
class Level_2_1 {
    public int[] solution(int[] progresses, int[] speeds) {

        // 기능개발 (Level_2)

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> answer_list = new ArrayList<>();

        for(int i = 0; i < progresses.length; i++)
        {
            int day = 0;
            for(int j = progresses[i]; j < 100; j += speeds[i])
            {
                day++;
            }
            list.add(day);
        }

        System.out.println("초기");
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        int prev = list.get(0);
        int count = 1;
        for(int i = 1; i < list.size(); i++)
        {
            if(prev < list.get(i))
            {
                answer_list.add(count);
                count = 1;
                prev = list.get(i);
            }
            else
                count++;
        }

        answer_list.add(count);


        System.out.println("마지막");
        for(int i = 0; i < answer_list.size(); i++)
        {
            System.out.println(answer_list.get(i));
        }

        int[] answer = new int[answer_list.size()];

        for(int i = 0; i < answer.length; i++)
        {
            answer[i] = answer_list.get(i);
        }

        return answer;
    }
}
