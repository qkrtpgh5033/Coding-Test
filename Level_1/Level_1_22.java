import java.util.*;
class Level_1_22 {
    public int solution(int n) {


        ArrayList<Integer>list= new ArrayList<>();
        int answer = 0;

        while(n>0)
        {
            int num = n % 3;
            list.add(num);
            n /= 3;
        }


        for(int i = 0 ; i < list.size(); i++)
        {
            answer += list.get(list.size() - (i+1)) * Math.pow(3,i);
        }
        return answer;
    }
}
