package Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 백준 - 2504번
 */
public class Problem_2504 {

    public static void main(String[] args) {
        Stack<Character>stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int result = 0;


        int mul = 1;
        for(int i = 0 ;i  < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (ch == '('){
                stack.push(ch);
                mul *= 2;
            }
            else if (ch== '['){
                stack.push(ch);
                mul *= 3;
            }
            else if (ch == ')'){
                System.out.println("str.charAt(i-1) = " + str.charAt(i - 1));
                System.out.println("stack.peek() = " + stack.peek());
                if(stack.isEmpty() || stack.peek() != '('){
                    System.out.println("0");
                    return;
                }

                if(str.charAt(i-1) == '(')
                {

                    result += mul;
                }

                stack.pop();
                mul /= 2;

            }
            else if (ch == ']') {
                System.out.println("str.charAt(i-1) = " + str.charAt(i - 1));
                System.out.println("stack.peek() = " + stack.peek());
                if (stack.isEmpty() || stack.peek() != '[') {
                    System.out.println("0");
                    return;
                }

                if (str.charAt(i-1) == '[') {

                    result += mul;
                }

                stack.pop();
                mul /= 3;
            }

        }

        System.out.println(result);



    }
}
