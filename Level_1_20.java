class Level_1_20 {
    public String solution(int a, int b) {

        // 2016년

        int [] days = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int total_day = 0;

        for(int i = 0; i < a-1; i++)
        {
            total_day += days[i];
        }
        total_day += b - 1;

        return week[(total_day+5) % 7];


    }
}
