class Level_1_9 {
    public String solution(String s) {

        // 이상한 문자 만들기

        String answer = "";
        String[] a=s.split(" ", -1);

        for(int i=0; i<a.length; i++)
        {
            String msg=a[i];
            for(int j=0; j<msg.length(); j++)
            {
                char c = msg.charAt(j);
                if(j%2==1)
                {

                    String b=Character.toString(c);
                    answer+=b.toLowerCase();
                }
                else
                {
                    String b=Character.toString(c);
                    answer+=b.toUpperCase();
                }
            }
            if(i==a.length-1)
            {
                break;
            }
            answer+=" ";
        }

        return answer;
    }
}