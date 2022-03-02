import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {

        // 처음 풀 떄
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

        // 두 번째 풀 때

//         Arrays.sort(strings, new Comparator<String>(){
//             @Override
//             public int compare(String s1, String s2)
//             {
//                 if(s1.charAt(n) > s2.charAt(n))
//                     return 1;
//                 else if (s1.charAt(n) == s2.charAt(n))
//                     return s1.compareTo(s2);
//                 else
//                     return -1;
//             }
//         });

//         return strings;

    }
}
