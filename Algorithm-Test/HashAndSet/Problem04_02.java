package HashAndSet;

import java.util.HashMap;
import java.util.Scanner;

public class Problem04_02 {


    public void solution(String str, String str2)
    {

        /**
         * 강사님 풀이
         */
        String answer = "YES";
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(Character key : str.toCharArray())
            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);

        for (Character key : str2.toCharArray()) {

            if(!hashMap.containsKey(key) || hashMap.get(key) == 0 )
                answer = "NO";
            else
                hashMap.put(key, hashMap.get(key) - 1);

        }
        System.out.println(answer);


//        HashMap<Character, Integer> hashMap = new HashMap<>();
//        HashMap<Character, Integer> hashMap2 = new HashMap<>();
//
//        for(Character key : str.toCharArray()){
//            hashMap.put(key, hashMap.getOrDefault(key, 0) + 1);
//        }
//
//        for(Character key : str2.toCharArray()){
//            hashMap2.put(key, hashMap2.getOrDefault(key, 0) + 1);
//        }
//
//        String answer = "NO";
//        if(hashMap.equals(hashMap2))
//            answer = "YES";
//
//
//        System.out.println(answer);



    }

    public static void main(String[] args){

        Problem04_02 T = new Problem04_02();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = sc.next();

        T.solution(str, str2);


    }
}
