package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 스택 10828번
 */

public class Problem_10828 {

    StackArr stack;

    public static void main(String[] args) {
        Problem_10828 main = new Problem_10828();
        main.init();

    }


    void init() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = 0;

        try {

            size = Integer.parseInt(br.readLine());
            stack = new StackArr(size);

            for(int i = 0; i < size; i++){

                StringTokenizer cmd = new StringTokenizer(br.readLine(), " ");
                play(cmd);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    void play(StringTokenizer st){
        String cmd = st.nextToken();

        if (cmd.equals("push")) {
            int num = Integer.parseInt(st.nextToken());
            stack.push(num);
        } else if (cmd.equals("pop")) {
            System.out.println(stack.pop());
        } else if (cmd.equals("size")) {
            System.out.println(stack.size());
        } else if (cmd.equals("empty")) {
            System.out.println((stack.empty()) ? "1" : "0");
        } else if (cmd.equals("top")) {
            System.out.println(stack.top());
        }
    }



}
class StackArr {

    int [] stack;
    int top = -1;
    public StackArr(int size) {
        stack = new int[size];
    }

    boolean empty(){
        if(top == -1) // 비어있는 경우
            return true;

        return false;
    }


    void push(int num){
        stack[++top] = num;
    }


    int pop(){

        if(empty()) // 스택에 정수가 없는 경우
            return -1;

        return stack[top--];
    }

    int size(){
        return (top+1);
    }



    int top(){
        if(empty())
            return -1;

        return stack[top];
    }


}

