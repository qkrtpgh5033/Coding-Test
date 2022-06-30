package DataStructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * N번째 큰 수 - 2075번
 */



public class Problem_2075 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int num = Integer.parseInt(br.readLine());

        int [][] arr = new int[num][num];

        for(int i = 0 ; i < arr.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                q.add(arr[i][j]);
            }
        }

        for(int i = 0 ; i < num-1; i++)
            q.poll();

        System.out.println(q.poll());


    }
}
