package Array;

import java.util.Scanner;

public class Problem02_05 {

    public void solution(int n)
    {
        int[] arr = new int[n+1];
        int answer = 0;

        for(int i = 2; i < arr.length; i++)
        {
            if(arr[i] == 0)
            {
                answer++;
                for(int j = i; j < arr.length; j+=i)
                {
                    arr[j] = 1;
                }
            }
        }

        System.out.println(answer);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem02_05 T = new Problem02_05();
        T.solution(n);
    }
}
