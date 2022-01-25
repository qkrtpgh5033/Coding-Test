import java.util.ArrayList;
import java.io.*;
import java.util.*;

class Level_1_10 {
    public String[] solution(String[] strings, int n) {

        //문자열 내 마음대로 정렬하기

        ArrayList<String> list = new ArrayList<>();

        for(int i = 0 ; i < strings.length; i++)
        {
            list.add(strings[i].charAt(n)+strings[i]);
        }

        Collections.sort(list);


        String[] answer= new String[strings.length];

        for(int i = 0 ; i < list.size(); i++)
        {
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }
}