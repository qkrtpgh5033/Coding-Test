class Level_1_18 {
    public String solution(String s) {

        // 가운데 글자 가져오기

        int length = s.length();
        int index = 0;

        String answer = "";
        index = length/2;

        if(length % 2 == 0 ) // 짝수
            answer = s.substring(index-1, index+1);

        else
            answer = s.substring(index, index+1);



        return answer;
    }
}
