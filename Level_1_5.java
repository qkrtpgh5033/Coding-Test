class Level_1_5 {
    public String solution(String phone_number) {
        //핸드폰 번호 가리기

        String answer = phone_number.substring(phone_number.length()-4, phone_number.length());
        String answer2 ="";

        for(int i = 0; i < phone_number.length()-4; i++)
        {
            answer2 += "*";
        }


        return answer2+answer;
    }
}