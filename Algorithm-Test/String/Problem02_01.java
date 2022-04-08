package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem02_01 {

    public void solution(int [] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i-1] < arr[i])
            {
                list.add(arr[i]);
            }
        }

        for(int i = 0 ; i < list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        Problem02_01 T = new Problem02_01();
        T.solution(arr);

    }
}
