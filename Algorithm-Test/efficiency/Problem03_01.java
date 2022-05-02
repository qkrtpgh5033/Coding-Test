package efficiency;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem03_01 {


    public void solution(int[] arr1, int[] arr2){

        /**
         * 내 풀이
         */
//        int size = arr1.length + arr2.length;
//        int[] arr = new int[size];
//        for(int i = 0 ; i < arr1.length; i++)
//            arr[i] = arr1[i];
//
//        for(int i = 0; i < arr2.length; i++)
//            arr[arr1.length+i] = arr2[i];
//
//        for(int i = 0; i < arr.length-1; i++)
//        {
//           for(int j = i; j < arr.length; j++)
//           {
//               if(arr[i] > arr[j])
//               {
//                   int temp = arr[i];
//                   arr[i] = arr[j];
//                   arr[j] = temp;
//               }
//           }
//
//        }
//        for(int i : arr)
//        {
//            System.out.print(i + " ");
//        }


        /**
         * 강사님 풀이
         */
        ArrayList<Integer> list = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        int p1_length = arr1.length;
        int p2_length = arr2.length;

        while (p1 < p1_length && p2 < p2_length)
        {
            if(arr1[p1] < arr2[p2])
                list.add(arr1[p1++]);
            else
                list.add(arr2[p2++]);
        }

        while(p1 < p1_length){
            list.add(arr1[p1++]);
        }

        while(p2 < p2_length){
            list.add(arr2[p2++]);
        }

        for(int i : list)
        {
            System.out.print(i + " ");
        }



    }

    public static void main(String[] args){
        Problem03_01 T = new Problem03_01();
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
