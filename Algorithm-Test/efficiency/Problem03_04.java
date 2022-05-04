package efficiency;

import java.util.Scanner;

public class Problem03_04 {

    /**
     *  7
     */
    public void solution(int [] arr, int sum)
    {

        int cnt = 0;
        int resultSum = 0;
        int lt = 0;

        for(int rt = 0; rt < arr.length; rt++){

            resultSum += arr[rt];
            if(resultSum == sum)
                cnt++;

            while(resultSum >= sum){
                resultSum -= arr[lt++];
                if(resultSum == sum)
                    cnt++;

            }
        }
        System.out.println(cnt);

    }

    public static void main(String[] args){
        Problem03_04 T = new Problem03_04();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = sc.nextInt();

        int[] arr = new int[num];

        for(int i = 0; i < num ; i++)
            arr[i] = sc.nextInt();

        T.solution(arr, sum);


    }
}
