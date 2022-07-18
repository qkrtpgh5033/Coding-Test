package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 : 16953번 A → B
 */

/**
 * 입력 : 2 162
 * -> 2 → 4 → 8 → 81 → 162 : 5
 *
 * 입력 : 100 40021
 * -> 100 → 200 → 2001 → 4002 → 40021 : 5
 *
 */
public class Problem_16953 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        int startValue = Integer.parseInt(str.nextToken());
        int endValue = Integer.parseInt(str.nextToken());

        int answer = 1;
        while(endValue != startValue){

            if(endValue < startValue){
                answer = -1;
                break;
            }

            if(endValue % 10 == 1){
                endValue = (endValue/10);
            } else if (endValue % 2 == 0){
                endValue = endValue/2;
            } else{
                answer = -1;
                break;
            }
            answer++;

        }

        System.out.println(answer);




    }
}
