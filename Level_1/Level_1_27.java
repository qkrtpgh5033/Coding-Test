class Level_1_27 {

    public static int distance(int pos, int mid)
    {
        // 키패드 누르기[카카오 인턴]
        if(pos == 0)
            pos = 11;
        if(mid == 0)
            mid = 11;


        int pos_x = (pos-1)/3;
        int pos_y = (pos-1)%3;


        int mid_x = (mid-1)/3;
        int mid_y = (mid-1)%3;

        int dis_x = Math.abs(pos_x - mid_x);
        int dis_y = Math.abs(pos_y - mid_y);


        return dis_x + dis_y;

    }

    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;

        for(int num : numbers)
        {
            // 왼쪽
            if(num == 1 || num == 4 || num == 7)
            {
                left = num;
                answer += "L";
            }
            // 오른쪽
            else if ( num == 3 || num == 6 || num == 9)
            {
                right = num;
                answer += "R";
            }
            //가운데
            else
            {

                int leftLength = distance(left, num);
                int rightLength =distance(right, num);

                //거리가 같은 경우
                if(leftLength == rightLength)
                {
                    if(hand.equals("left"))
                    {
                        left = num;
                        answer += "L";
                    }
                    else if(hand.equals("right"))
                    {
                        right = num;
                        answer += "R";
                    }
                }
                //거리가 다른 경우
                else if(rightLength < leftLength)
                {
                    right = num;
                    answer += "R";

                }
                else if(leftLength < rightLength)
                {
                    left = num;
                    answer += "L";
                }


            }

        }

        return answer;
    }
}
