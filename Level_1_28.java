class Level_1_28 {
    public int solution(int[] absolutes, boolean[] signs) {

        // 음양 더하기 (난이도 하)

        int answer = 0;

        for(int i = 0 ; i < signs.length; i++)
        {
            if(signs[i])
                answer += absolutes[i];
            else
                answer += (-1*absolutes[i]);
        }

        return answer;

    }
}
