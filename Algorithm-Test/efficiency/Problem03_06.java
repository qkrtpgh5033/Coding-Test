package efficiency;

import java.util.Scanner;

public class Problem03_06 {


    public void solution(int [] arr, int num)
    {

        int answer = 0;
        int cnt = 0;

        int lt=0;
        int rt=0;

        for(rt = 0 ; rt < arr.length; rt++) {

            if(arr[rt] == 0)
            {
                cnt++;
            }

            while (cnt > num){
                if(arr[lt] == 0 )
                    cnt--;
                lt++;
            }

            int length = rt - lt + 1;

            answer = Math.max(answer, length);

        }

        System.out.println(answer);


    }

    public static void main(String[] args){

        Problem03_06 T = new Problem03_06();
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int num = sc.nextInt();

        int[] arr = new int[length];

        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        T.solution(arr, num);


    }
}
