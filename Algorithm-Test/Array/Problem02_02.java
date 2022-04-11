package Array;

import java.util.*;

public class Problem02_02 {

    public void solution(int [] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        int max = arr[0];

        for(int i = 1 ; i < arr.length; i++)
        {
          if(max < arr[i])
          {
              max = arr[i];
              list.add(max);
          }
        }

        System.out.println(list.size());

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        Problem02_02 T = new Problem02_02();
        T.solution(arr);

    }
}
