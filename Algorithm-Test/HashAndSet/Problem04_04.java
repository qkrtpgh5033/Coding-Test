package HashAndSet;

import java.util.HashMap;
import java.util.Scanner;

public class Problem04_04 {


    public void solution(String str, String find)
    {

        /**
         * 강사님 풀이 시간복잡도 O(n)
         */

        HashMap<Character, Integer> hashA = new HashMap<>();
        HashMap<Character, Integer> hashB = new HashMap<>();
        int answer = 0;
        for(int i = 0; i < find.length(); i++)
            hashB.put(find.charAt(i), hashB.getOrDefault(find.charAt(i), 0 ) + 1);

        for(int i =0; i < find.length()-1; i++)
            hashA.put(str.charAt(i), hashA.getOrDefault(str.charAt(i), 0 ) + 1);

        int lt = 0;

        for (int rt = find.length() - 1; rt < str.length(); rt++) {

            hashA.put(str.charAt(rt), hashA.getOrDefault(str.charAt(rt), 0) + 1);

            if(hashB.equals(hashA))
                answer++;

            hashA.put(str.charAt(lt), hashA.get(str.charAt(lt)) - 1);
            if(hashA.get(str.charAt(lt)) < 1 )
                hashA.remove(str.charAt(lt));

            lt++;

        }

        System.out.println(answer);





        /**
         * 내 풀이 시간복잡도 O(n2)
         */
//        HashMap<Character, Integer> hashMap = new HashMap<>();
//        int answer = 0;
//
//        for (int i = 0; i < find.length(); i++) {
//            hashMap.put(find.charAt(i), hashMap.getOrDefault(find.charAt(i), 0 ) + 1);
//        }
//
//
//
//        for(int i = 0 ;i  < str.length() - find.length() + 1; i++)
//        {
//
//            HashMap<Character, Integer> copy = new HashMap<>();
//
//            for(int j = i;  j < i + find.length(); j++)
//                copy.put(str.charAt(j), copy.getOrDefault(str.charAt(j), 0 ) + 1);
//
//            if(hashMap.equals(copy))
//                answer++;
//        }
//
//        System.out.println(answer);



    }

    public static void main(String[] args){

        Problem04_04 T = new Problem04_04();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String find = sc.next();


        T.solution(str, find);


    }
}
