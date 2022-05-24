package Array;

import java.util.Scanner;

public class Problem02_12 {


    public void solution(int[][] arr){


        /**
         * (1,1), (1,2) ~ (1,4)
         * (4,1), (4,2) ~ (4,4)
         */
        int answer = 0;


        for(int i = 1 ; i <= arr[0].length; i++)
        {
            for(int j = 1 ; j <= arr[0].length; j++)
            {
                int cnt =0;
                for(int k = 0; k < arr.length; k++)  // 시험 횟수
                {
                    int pi = 0;
                    int pj = 0;
                    for(int s = 0; s < arr[0].length; s++) // 학생번호
                    {
                        if(arr[k][s] == i)
                         {
                             pi = s;
                         }
                         if(arr[k][s] == j)
                         {
                             pj = s;
                         }
                    }
                    if(pi < pj)
                    {
                        cnt++;
                    }
                }
                if( cnt == arr.length)
                    answer++;


            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args){
        Problem02_12 T = new Problem02_12();
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt(); // 학생 수
        int math = sc.nextInt(); // 시험 횟수

        int[][] arr=new int[math][num];

        for(int i = 0 ; i < arr.length; i++)
        {
            for(int j = 0 ; j < arr[0].length; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }


        T.solution(arr);


    }
}
