package Math_Basic_01;

import java.util.Scanner;

/**
 * 벌집
 */

public class Problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int Max = 6;
        int num = sc.nextInt();
        int result = 2;
        int cnt = 1;

        if(num <= 1)
            System.out.println(1);
        else{
            while(result <= num){
                result += Max * cnt;
                cnt++;
            }

            System.out.println(cnt);

        }






    }
}
