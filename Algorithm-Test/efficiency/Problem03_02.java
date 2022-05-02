package efficiency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem03_02 {


    public void solution(int[] arr1, int[] arr2){

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Integer> list = new ArrayList<>();



        int p1 = 0;
        int p2 = 0;

        int p1_size = arr1.length;
        int p2_size = arr2.length;

        while(p1 < p1_size && p2 < p2_size)
        {
            if(arr1[p1] == arr2[p2])
            {
                list.add(arr1[p1]);
                p1++;
                p2++;
            }
            else if (arr1[p1] < arr2[p2])
                p1++;
            else
                p2++;
        }


        Collections.sort(list);

        for(int i : list)
        {
            System.out.print(i + " ");
        }



    }

    public static void main(String[] args){
        Problem03_02 T = new Problem03_02();
        Scanner sc = new Scanner(System.in);

        int num=sc.nextInt(); // 학생 수
        int[] arr1 = new int[num];
        for(int i = 0 ;i  < arr1.length; i++)
        {
            arr1[i] = sc.nextInt();
        }

        num = sc.nextInt();
        int[] arr2 = new int [num];
        for(int i = 0 ;i  < arr2.length; i++)
        {
            arr2[i] = sc.nextInt();
        }



        T.solution(arr1, arr2);


    }
}
