class Level_1_12 {
    public String solution(String s, int n) {

        //시저 암호

        char [] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++)
        {
            if( arr[i] != ' ')
            {
                int old_asc = (int) arr[i];
                int asc = (int) arr[i] + n;

                if( old_asc >= 65 && old_asc <= 90)
                {
                    if(asc > 90)
                    {
                        asc -= 26;
                    }

                }
                else if (old_asc >= 97 && old_asc <= 122)
                {
                    if(asc > 122)
                    {
                        asc -= 26;
                    }

                }

                arr[i] = (char) asc;
            }

        }
        String answer = String.valueOf(arr);
        return answer;
    }
}

