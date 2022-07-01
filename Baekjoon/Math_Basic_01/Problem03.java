package Math_Basic_01;

import java.util.Scanner;

/**
 * 백준 - 1193번 분수찾기
 */

public class Problem03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int cross = 1;
        int prev_num = 0;

        while(true){


            if(num <= cross + prev_num){

                if(cross % 2 == 0){
                    System.out.print((num - prev_num) + "/" + (cross - (num - prev_num - 1)));
                    break;
                }
                else{
                    System.out.print((cross - (num - prev_num - 1)) + "/" + (num - prev_num));
                    break;
                }

            }
            else{

                prev_num+= cross;
                cross++;
                System.out.println("prev_num = " + prev_num);
                System.out.println("cross = " + cross);
            }
        }





    }
}
