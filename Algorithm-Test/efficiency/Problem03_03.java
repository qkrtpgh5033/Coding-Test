package efficiency;

import java.util.Scanner;

public class Problem03_03 {


    public void solution(int k , int[] arr)
    {

        int sum = 0;

        for(int i = 0 ; i < k; i++)
            sum += arr[i];

        int max =  sum;

        /**
         * 슬라이딩 윈도우
         */
        for(int i = k; i < arr.length; i++)
        {
            sum += arr[i] - arr[i-k];
            if(max < sum)
                max = sum;
        }

    }

    public static void main(String[] args){
        Problem03_03 T = new Problem03_03();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int k = sc.nextInt();

        int [] arr = new int[num];

        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();



        T.solution(k, arr);


    }
}
