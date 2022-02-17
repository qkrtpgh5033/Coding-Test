import java.util.*;

class Level_1_24 {
    public int solution(int[] d, int budget) {

        // 예산

        Arrays.sort(d);
        int cnt = 0;

        for(int i = 0 ; i < d.length; i++)
        {

            budget -= d[i];

            if(budget < 0)
                break;

            cnt++;
        }

        return cnt;
    }
}
