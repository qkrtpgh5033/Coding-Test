package Array;

import java.util.Scanner;

public class Problem02_03 {

    public void solution(int [] a, int [] b)
    {
//        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < a.length; i++)
        {
            if(a[i] == 1  && b[i] == 3) System.out.println("A");
            else if(a[i] == 3  && b[i] == 2) System.out.println("A");
            else if(a[i] == 2  && b[i] == 1) System.out.println("A");
            else if(a[i] == b[i]) System.out.println("D");
            else System.out.println("B");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] a = new int [n];
        int [] b = new int [n];

        for(int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();
        for(int i = 0; i < b.length; i++)
            b[i] = sc.nextInt();

        Problem02_03 T = new Problem02_03();
        T.solution(a, b);

    }
}
