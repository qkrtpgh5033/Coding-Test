package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem02_04 {

    public void solution(int n )
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);

        for(int i =  0; i < n-2; i++)
        {
            int num1 = list.get(i);
            int num2 = list.get(i+1);
            
            list.add(num1+num2);
        }
        
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Problem02_04 T = new Problem02_04();
        System.out.println(" hi " );
        T.solution(n);
        System.out.println(" hi " );

    }
}
