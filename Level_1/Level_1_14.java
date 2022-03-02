class Level_1_14 {
    public long solution(int price, int money, int count) {

        //부족한 금액 계산하기

        long after = 0;
        for(int i = 1; i <= count; i++)
        {
            after += price * i;
        }

        long answer = after - money;

        return (answer < 0 ) ? 0 : answer;
    }
}
