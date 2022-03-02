class Level_1_4 {
    public String solution(String new_id) {

        String [] sign = {"-","_","."};

        //1단계
        new_id = new_id.toLowerCase();

        //2단계
        String id = "";
        for(int i = 0; i < new_id.length(); i++)
        {
            char ch = new_id.charAt(i);
            if(ch >= '0' && ch <= '9' )
                id += String.valueOf(ch);
            else if(ch >= 'a' && ch <= 'z')
                id += String.valueOf(ch);
            else if(ch == '-' || ch =='_' || ch == '.')
                id+= String.valueOf(ch);
        }
        //3단계
        id = id.replaceAll("[.]{2,}", "."); // .2개 이상 .으로

        //4단계
        if(id.startsWith("."))
            id = id.substring(1, id.length());
        if(id.endsWith("."))
            id = id.substring(0, id.length()-1);

        //5단계
        if(id.length() == 0)
            id += "a";

        //6단계
        if(id.length() >= 16)
            id = id.substring(0,15);
        if(id.endsWith("."))
            id = id.substring(0, id.length()-1);
        //7단계
        if(id.length() <= 2)
        {
            String last_char = id.charAt(id.length()-1)+"";

            while(id.length() < 3)
            {
                id = id + last_char;
            }

        }
        return id;
    }
}
