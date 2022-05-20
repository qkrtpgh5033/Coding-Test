package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class Problem05_04 {


    public void solution(String str)
    {
        Stack<Integer> stack = new Stack<>();

        for (Character c : str.toCharArray()) {
            if(Character.isDigit(c)){
                stack.push(c - 48);
            }
            else{
                int rt = stack.pop();
                int lt = stack.pop();
                int result = 0;
                if(c == '+')
                    result = lt + rt;
                else if ( c == '-')
                    result = lt - rt;
                else if ( c == '*')
                    result = lt * rt;
                else if ( c== '/')
                    result = lt / rt;

                stack.push(result);
            }
        }
        System.out.println(stack.get(0));

    }

    public static void main(String[] args){

        Problem05_04 T = new Problem05_04();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        T.solution(str);


    }
}
