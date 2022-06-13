package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem05_07 {

    public String solution(String key, String str) {
        Queue<Character> queue = new LinkedList<>();

        for(int i = 0 ; i < key.length(); i++ )
            queue.offer(key.charAt((i)));

        for(int i = 0 ; i < str.length(); i++){

            Character ch = str.charAt(i);

            if(queue.contains(ch)){
                Character keyCh = queue.poll();
                if (ch != keyCh)
                    return "NO";
            }
        }

        if(!queue.isEmpty()) // 모두 안비어져있으면 필수과목 이수를 아직 못한거임.
            return  "NO";

        return "YES";
    }

    public static void main(String[] args){

        Problem05_07 T = new Problem05_07();
        Scanner sc = new Scanner(System.in);

        String key = sc.next();
        String str = sc.next();

        System.out.println(T.solution(key, str));



    }
}
