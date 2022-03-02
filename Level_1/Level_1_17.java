import java.util.*;

class Level_1_17 {
    public int[] solution(int[] answers) {

        // 모의고사

        ArrayList<Integer> list = new ArrayList<>();

        int[] arr = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};

        int[] score = {0,0,0};



        for(int i = 0; i < answers.length; i++)
        {
            if(arr[i%arr.length] == answers[i])
                score[0]++;
            if(arr2[i%arr2.length] == answers[i])
                score[1]++;
            if(arr3[i%arr3.length] == answers[i])
                score[2]++;
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));

        if(max == score[0])
            list.add(1);
        if(max == score[1])
            list.add(2);
        if(max == score[2])
            list.add(3);


        int [] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++)
        {
            answer[i] = list.get(i);
        }


        return answer;
    }
}
