package Stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 스택 수열
 */
public class Problem_1874 {

    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        int size = sc.nextInt();

        int startNum = 0; // 오름차순 용 변수


        for(int i = 0; i< size; i++){

            int num = sc.nextInt();

            if(num > startNum){

                for(int j = startNum+1; j <= num; j++){
                    stack.push(j);
                    result.append("+"+"\n");
                }
                startNum = num; // 초기화

            }
            else if(stack.peek() != num){
                System.out.println("NO");
                return;
            }

            stack.pop();
            result.append("-" + "\n");
        }

        System.out.println(result);


    }
}
