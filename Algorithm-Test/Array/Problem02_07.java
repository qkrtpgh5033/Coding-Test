package Array;

import java.util.Scanner;

public class Problem02_07 {

    public void solution(int [] arr)
    {

//        int index = -1;
//        int answer = 0;
//        for(int i = 0; i < arr.length; i++)
//        {
//            if(arr[i] == 0)
//            {
//                int cnt = i - (index+1);
//                int sum = (cnt * (cnt+1)) / 2;
//                answer += sum;
//                index = i;
//            }
//            else if ( i == arr.length-1)
//            {
//                int cnt = (i+1) - (index+1);
//                int sum = (cnt * (cnt+1)) / 2;
//                answer += sum;
//            }
//         }
        int answer = 0;
        int cnt = 0;
        for(int i = 0 ;i  < arr.length; i++)
        {
            if(arr[i] == 1)
            {
                cnt++;
                answer+=cnt;
            }
            else
                cnt=0;
        }
        System.out.println(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        Problem02_07 T = new Problem02_07();
        T.solution(arr);
    }
}
