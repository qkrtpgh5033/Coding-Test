package Array;

import java.util.Scanner;

public class Problem02_10 {

    public void solution(int [][] arr)
    {

        int answer = 0;
        for(int i= 1; i < arr.length-1; i++)
        {
            for(int j = 1; j  < arr.length-1; j++)
            {
                int mid = arr[i][j];
                int up = arr[i-1][j];
                int left = arr[i][j-1];
                int right = arr[i][j+1];
                int down = arr[i+1][j];

                if((mid > up) && (mid > left) && (mid > right) && (mid > down))
                    answer++;
            }

        }

        System.out.println(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n+2][n+2];
        for(int i = 1 ; i < arr.length-1; i++)
        {
            for(int j = 1 ; j < arr.length-1; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        Problem02_10 T = new Problem02_10();
        T.solution(arr);
    }
}
