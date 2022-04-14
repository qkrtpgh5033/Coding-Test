package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem02_06 {

    public boolean isPrime(int n)
    {
        if(n == 1)
            return false;
        for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public void solution(int [] arr)
    {
        int answer = 0;
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();



        for(int i = 0; i < arr.length; i++)
        {
            int temp = arr[i];
            int num = 0;
            int cnt = (int)(Math.log10(temp)+1);
            while(temp > 0)
            {
                num += temp%10 * (Math.pow(10, cnt-1));
                cnt--;
                temp/= 10;
            }
            if(isPrime(num))
                list.add(num);
        }

        for(int i = 0 ; i < list.size(); i++)
            System.out.print(list.get(i) + " ");




    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        Problem02_06 T = new Problem02_06();
        T.solution(arr);
    }
}
