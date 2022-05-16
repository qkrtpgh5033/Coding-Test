package StackAndQueue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Problem05_02 {


    public void solution(String str)
    {
        Stack<Character> stack = new Stack<>();
        ArrayList<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {

            if(c == ')'){

                while (stack.pop() != '(');
            }
            else
                stack.push(c);

        }
        for (Character character : stack) {
            System.out.print(character);
        }


    }

    public static void main(String[] args){

        Problem05_02 T = new Problem05_02();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        T.solution(str);


    }
}
