package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class Problem05_03 {


    public void solution(int [][] board, int [] move)
    {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for(int i = 0; i < move.length; i++){

            int col = move[i];

            for(int j = 0; j < board.length; j++){

                int draw = board[j][col - 1]; // 뽑기

                if(draw != 0){
//                    System.out.println("draw = " + draw);
                    board[j][col-1] = 0;

                    if(!stack.isEmpty()){
                        int peek = stack.peek();
                        if(peek == draw){
//                            System.out.println("걸림");
//                            System.out.println("peek = " + stack.peek());
//                            System.out.println("i = " + i);
//                            System.out.println("move[i] = " + move[i]);
                            stack.pop();
                            answer += 2;
                        }
                        else
                            stack.push(draw);
                    }
                    else
                        stack.push(draw);

                    break;

                }
            }
        }

        System.out.println(answer);

    }

    public static void main(String[] args){

        Problem05_03 T = new Problem05_03();
        Scanner sc = new Scanner(System.in);


        int num = sc.nextInt();
        int [][] arrBoard = new int[num][num];

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                arrBoard[i][j] = sc.nextInt();
            }
        }

        int move = sc.nextInt();
        int [] arrMove = new int [move];
        for(int i = 0 ; i < move; i++){
            arrMove[i] = sc.nextInt();
        }

        T.solution(arrBoard, arrMove);


    }
}
