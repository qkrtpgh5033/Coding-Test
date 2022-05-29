package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Problem05_06 {

    public void solution(int num, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= num; i++) {
            queue.add(i);
        }

        // 1 2 3 4 5 6 7 8

        while (queue.size() != 1) {

            for (int i = 0; i < k - 1; i++) {
                int push = queue.poll();
                queue.add(push);
            }
            queue.poll();
        }

        System.out.println(queue.peek());

    }

    public static void main(String[] args){

        Problem05_06 T = new Problem05_06();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int k = sc.nextInt();

        T.solution(num,k);



    }
}
