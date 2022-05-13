package HashAndSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem04_05 {


    public void solution(int [] arr , int num, int k)
    {
        int answer = 0;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for(int i = 0; i < num; i++){
            for(int j = i+1; j < num; j++){
                for(int l = j+1; l < num; l++){
                    treeSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (Integer integer : treeSet) {
            cnt++;
            if(cnt == k)
            {
                System.out.println(integer);
                break;
            }
        }
        if(cnt != k)
            System.out.println(-1);


    }

    public static void main(String[] args){

        Problem04_05 T = new Problem04_05();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[num];

        for(int i = 0; i <arr.length; i++)
            arr[i] = sc.nextInt();

        T.solution(arr, num, k);


    }
}
