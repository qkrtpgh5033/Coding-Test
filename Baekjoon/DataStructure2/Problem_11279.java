package DataStructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 최대 힙 - 11279번
 */
public class Problem_11279 {

    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int size = Integer.parseInt(br.readLine());
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for(int i = 0 ; i<size; i++){
//            int num = Integer.parseInt(br.readLine());
//            if(num == 0){
//                if(!list.isEmpty())
//                {
//                    int maxValue = Collections.max(list);
//                    System.out.println(maxValue);
//                    list.remove(list.indexOf(maxValue));
//                }
//                else
//                    System.out.println("0");
//            }
//            else
//                list.add(num);
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0 ; i<size; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(!q.isEmpty())
                    System.out.println(q.poll());
                else
                    System.out.println("0");
            }
            else
                q.add(num);
        }

    }
}
