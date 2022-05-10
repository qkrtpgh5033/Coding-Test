package HashAndSet;

import java.util.HashMap;
import java.util.Scanner;

public class Problem04_01 {


    public void solution(String arr)
    {
        HashMap<Character, Integer> hashMap = new HashMap<>();


        for(Character c : arr.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c, 0) +1);
        }

        int max = 0;
        char answer = '0';
        for(Character i : hashMap.keySet()){ //저장된 key값 확인
            if(max < hashMap.get(i)){
                max = hashMap.get(i);
                answer = i;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args){

        Problem04_01 T = new Problem04_01();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String arr = sc.next();

        T.solution(arr);


    }
}
