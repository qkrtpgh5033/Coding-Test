package String;

import java.util.Scanner;

public class Problem01_10 {

    public void solution(String s, char c)
    {
        int p = 1000;
        int[] arr = new int[s.length()];

        for(int i = 0 ; i < s.length(); i++)
        {
            if(s.charAt(i) == c)
            {
                p = 0;
                arr[i] = p;
            }
            else
            {
                p++;
                arr[i] = p;
            }

        }

        p = 1000;
        for(int i = s.length()-1; i >= 0; i--)
        {
            if(s.charAt(i) == c)
                p = 0;
            else
            {
                p++;
                arr[i] = Math.min(arr[i], p);
            }
        }
        for(int i : arr)
        {
            System.out.print(i + " ");
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        Problem01_10 T = new Problem01_10();
        T.solution(str,c);

    }
}
