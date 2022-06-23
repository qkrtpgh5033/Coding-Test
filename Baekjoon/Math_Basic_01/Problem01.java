package Math_Basic_01;

import java.util.Scanner;

/**
 * 손익분기점
 */

public class Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if( b >= c )
            System.out.println(-1);
        else{
            int result = (a / (c-b)) + 1;
            System.out.println(result);
        }
    }
}
