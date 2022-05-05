package efficiency;

import java.util.Scanner;

public class Problem03_05 {


    public void solution(int num)
    {

//        int cnt = 0;
//        for(int i = num; i > 0; i--){
//            int sum = 0;
//            for(int j = i-1; j > 0; j++){
//                    sum += j;
//                    if(sum == num){
//                        cnt++;
//                        break;
//                    }
//                    else if( sum > num)
//                        break;
//            }
//        }
//
//        System.out.println(cnt);

        int lt = 0;
        int size = (num/2)+1;
        int [] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }


        int cnt = 0;
        int sum = 0;
        for(int rt = 0 ; rt < size; rt++)
        {
            sum += arr[rt];

            if(sum == num){
                cnt++;
            }
            while(sum >= num){
                sum -= arr[lt++];
                if(sum == num)
                    cnt++;
            }

        }

        System.out.println(cnt);

    }

    public static void main(String[] args){

        Problem03_05 T = new Problem03_05();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        T.solution(num);


    }
}
