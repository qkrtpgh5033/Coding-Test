package Array;

import java.util.Scanner;

public class Problem02_11 {

    int[] dx={-1, 0, 1, 0};
    int[] dy={0, 1, 0, -1};
    public void solution(int n, int[][] arr){

        int max = 0;
        int answer = 0;
        for(int i = 0 ; i < n; i++)
        {
            int cnt = 0;
            for(int j = 0 ; j < n; j++)
            {
                for(int k = 0; k < 5; k++)
                {
                    if(arr[i][k] == arr[j][k])
                    {
                        cnt++;
                        break;
                    }
                }
            }

            if(max < cnt){
                max = cnt;
                answer = i+1;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args){
        Problem02_11 T = new Problem02_11();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr=new int[n][5];
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        T.solution(n, arr);
    }
}
