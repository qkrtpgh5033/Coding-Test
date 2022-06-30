package DataStructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * 최대 힙 - 11286번
 */



public class Problem_11286 {


    public static void main(String[] args) throws IOException {

        /**
         * 시간초과
         */
        PriorityQueue<Integer> q = new PriorityQueue<>();
        PriorityQueue<Integer> absQ = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        for(int i = 0 ;i  < size; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0 ){
                if(q.isEmpty())
                    System.out.println("0");
                else{
                    int peek = absQ.peek();

                    if(q.contains(-1*peek)){
                        System.out.println(-peek);
                        q.remove(-peek);

                    }
                    else{
                        System.out.println(peek);
                        q.remove(peek);
                    }

                    absQ.poll();
                }
            }
            else {
                q.add(num);
                absQ.add(Math.abs(num));
            }
        }


    }
}
