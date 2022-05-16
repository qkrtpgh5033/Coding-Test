package StackAndQueue;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class Main {


    public void solution(String str)
    {
        Stack<Character> stack = new Stack<>();

        /**
         * 강사님 풀이
         */

        String answer = "YES";
        for (char c : str.toCharArray()) {
            if(c == '(')
                stack.push(c);
            else{
                if(stack.isEmpty()){
                    answer = "NO";
                    break;
                }
                stack.pop();
            }
        }

        if(!stack.isEmpty())
            answer = "NO";

        System.out.println(answer);

        /**
         * 내 풀이
         */
//        for (char c : str.toCharArray()) {
//
//            if(stack.isEmpty())
//                stack.push(c);
//            else{
//
//                char ch = stack.peek();
//
//                if(c == ')' && ch == '(')
//                    stack.pop();
//                else
//                    stack.push(c);
//            }
//
//
//        }
//        if (stack.size() == 0)
//            System.out.println("YES");
//        else
//            System.out.println("NO");



    }

    public static void main(String[] args){

        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        T.solution(str);


    }
}
