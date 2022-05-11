package HashAndSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Problem04_03 {


    public void solution(int [] arr, int k)
    {
        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i = 0 ;i < k-1; i++)
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0 ) +1);

        int lt = 0;

        for(int rt = k-1; rt < arr.length; rt++){
            hashMap.put(arr[rt], hashMap.getOrDefault(arr[rt], 0) + 1);
            list.add(hashMap.size());

            hashMap.put(arr[lt], hashMap.get(arr[lt]) -1);
            if(hashMap.get(arr[lt]) == 0)
                hashMap.remove(arr[lt]);

            lt++;
        }

        for (Integer i : list) {
            System.out.print(i +" ");
        }





//        for(int i = 0 ; i < arr.length - k + 1; i++ ){
//
//            HashMap<Integer, Integer> hashMap = new HashMap<>();
//
//            for(int j = i; j < k+i; j++){
//
//                hashMap.put(arr[j], hashMap.getOrDefault(arr[j], 0)+1);
//
//            }
//
//            int value = k;
//            for(Integer key : hashMap.keySet()) {
//                if(hashMap.get(key) > 1)
//                    value -= 1;
//            }
//            list.add(value);
//
//        }
//
//        for (int i : list) {
//            System.out.print(i +" ");
//        }

    }

    public static void main(String[] args){

        Problem04_03 T = new Problem04_03();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[num];

        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        T.solution(arr, k);


    }
}
