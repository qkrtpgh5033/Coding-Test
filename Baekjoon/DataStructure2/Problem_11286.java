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
         * 우선순위 큐 -> compare 메서드 오버라이딩으로 우선순위를 정해줄 수 있음.
         * Comparator로 해결
         */
        PriorityQueue<Integer> q = new PriorityQueue<Integer>((o1, o2) -> {
            int absO1 = Math.abs(o1);
            int absO2 = Math.abs(o2);
            // 절대값이 같으면 각 수 자체로만 비교
            return (absO1 == absO2) ? (o1 > o2 ? 1 : -1) : absO1-absO2;

        });


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        for(int i = 0 ;i  < size; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(q.isEmpty())
                    System.out.println("0");
                else
                    System.out.println(q.poll());
            }
            else {
                q.add(num);
            }
        }
    }
}
