package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class Problem05_05 {


    public void solution(String str)
    {
        Stack<Character> stack = new Stack<>();
        int answer = 0;


        for(int i = 0; i  < str.length(); i++){
            if(str.charAt(i) == '(')
                stack.push('(');
            else{
                stack.pop();
                if(str.charAt(i-1) == '(')
                    answer += stack.size();
                else
                    answer ++;
            }
        }

        System.out.println(answer);

    }

    public static void main(String[] args){

        Problem05_05 T = new Problem05_05();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        T.solution(str);


    }
}
